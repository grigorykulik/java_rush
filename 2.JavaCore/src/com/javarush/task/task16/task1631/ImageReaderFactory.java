package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes ir) {
        ImageReader result = null;

        if (ir == ImageTypes.BMP) {
            result = new BmpReader();
        } else if (ir == ImageTypes.JPG) {
            result = new JpgReader();
        } else if (ir == ImageTypes.PNG) {
            result = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return result;
    }
}
