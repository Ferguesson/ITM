package task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-r id
-u id name sex bd
-d id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -r:
Миронов м 15-Apr-1990

Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
Например, при запуске программы c параметрами:
-c name sex bd
получим в методе main
args[0] = "-c"
args[1] = "name"
args[2] = "sex"
args[3] = "bd"
Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments в меню Run -> Edit Configurations.


Requirements:
1. Класс Solution должен содержать public static поле allPeople типа List<Person>.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
4. При запуске программы с параметром -r программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
5. При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
6. При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    public static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }


    public static void main(String[] args) {
        //напишите тут ваш код
        if (args.length < 2 || args.length > 5) {
            System.out.println("Invalid number of arguments.");
            return;
        }


        String logicArgument = args[0];
        int id;
        String name;
        String sex;
        String date;


        //main else-if choice
        if (logicArgument.equals("-c")) {
            name = args[1];
            sex = args[2];
            date = args[3];

            create(name, sex, date);


        } else if (logicArgument.equals("-r")) {
            id = Integer.parseInt(args[1]);

            read(id);


        } else if (logicArgument.equals("-u")) {
            id = Integer.parseInt(args[1]);
            name = args[2];
            sex = args[3];
            date = args[4];

            update(id, name, sex, date);


        } else if (logicArgument.equals("-d")) {
            id = Integer.parseInt(args[1]);
            delete(id);
        }
    }


    //Methods declaration.
    public static void create(String name, String sex, String date) {
        Date birthDate = new Date();
        try {
            birthDate = inputFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Invalid Date format.");
        }

        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, birthDate));
        } else if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, birthDate));
        } else {
            System.out.println("Invalid format.");
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void read(int id) {
        Person currenPerson = allPeople.get(id);

        String name = currenPerson.getName();
        String sex;
        String birthDate = outputFormat.format(currenPerson.getBirthDate());

        switch (currenPerson.getSex()) {
            case MALE:
                sex = "м";
                break;
            case FEMALE:
                sex = "ж";
                break;
            default:
                sex = "unknown";
        }
        System.out.println(name + " " + sex + " " + birthDate);
    }

    public static void update(int id, String name, String sex, String date) {
        Person currenPerson = allPeople.get(id);

        currenPerson.setName(name);

        if (sex.equals("м")) {
            currenPerson.setSex(Sex.MALE);
        } else if (sex.equals("ж")) {
            currenPerson.setSex(Sex.FEMALE);
        } else {
            System.out.println("Invalid format");
            return;
        }

        try {
            currenPerson.setBirthDate(inputFormat.parse(date));
        } catch (ParseException e) {
            System.out.println("Invalid Date format.");
        }
    }

    public static void delete(int id) {
        Person currenPerson = allPeople.get(id);

        currenPerson.setName(null);
        currenPerson.setSex(null);
        currenPerson.setBirthDate(null);
    }
}

