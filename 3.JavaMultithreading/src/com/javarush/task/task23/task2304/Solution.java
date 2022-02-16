package com.javarush.task.task23.task2304;

import java.util.List;
import java.util.Map;

/* 
Inner 3
*/

public class Solution {

    private List<com.javarush.task.task23.task2304.Solution.Task> tasks;
    private List<String> names;

    private com.javarush.task.task23.task2304.Solution.DbDataProvider taskDataProvider = new com.javarush.task.task23.task2304.Solution.TaskDataProvider();
    private com.javarush.task.task23.task2304.Solution.DbDataProvider nameDataProvider = new com.javarush.task.task23.task2304.Solution.NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task {
    }

    private class TaskDataProvider implements com.javarush.task.task23.task2304.Solution.DbDataProvider<com.javarush.task.task23.task2304.Solution.Task> {
        @Override
        public void refreshAllData(Map criteria) {
            //get tasks from server by criteria
            tasks = MockDB.getFakeTasks(criteria);
        }
    }

    private class NameDataProvider implements com.javarush.task.task23.task2304.Solution.DbDataProvider<String> {
        @Override
        public void refreshAllData(Map criteria) {
            //get names from server by criteria
            names = MockDB.getFakeNames(criteria);
        }
    }

    public static void main(String[] args) {
        new com.javarush.task.task23.task2304.Solution().refresh();
    }
}
