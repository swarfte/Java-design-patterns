package templateMethodPattern;

import java.util.List;

public class MyStringListTestDrive {
    public static void main(String[] args) {
        String[] ducks = {
            "Daffy",
            "Dewey",
            "Howard",
            "Louie",
            "Donald",
            "Huey"
        };

        MyStringList duckList = new MyStringList(ducks);
        List<String> duckList2 = duckList.subList(2,3);
        System.out.println(duckList2);
    }
}
