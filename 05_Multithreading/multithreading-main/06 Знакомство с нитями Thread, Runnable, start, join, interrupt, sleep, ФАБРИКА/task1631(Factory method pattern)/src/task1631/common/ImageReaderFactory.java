package task1631.common;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        if (imageType == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        switch (imageType) {
            case PNG:
                return new PngReader();
            case JPG:
                return new JpgReader();
            case BMP:
                return new BmpReader();
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");

        }
    }
}
