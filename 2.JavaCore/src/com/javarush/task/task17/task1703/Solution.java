package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        // список заметок
        public final List<String> notes = new ArrayList<String>();

        // метод для добавления заметок
        // принимает индекс и строковое значение
        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);

            synchronized (notes) {
                notes.add(index, note);
            }

            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        // метод для удаления заметки по индексу
        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = null;

            synchronized (notes) {
                note = notes.remove(index);
            }
            
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);

        }
    }

}
