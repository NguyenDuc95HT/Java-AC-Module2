package SplitString;

public class ConvertStudent {
    private static final int NAME_PART = 0;
    private static final int AGE_PART = 1;
    private static final int YEAR_PART = 2;

    public static Student convert(String str) {
        String[] arrStr = str.split(" ");
        Student student = new Student();
        student.setName(arrStr[NAME_PART]);
        student.setAge(Integer.parseInt(arrStr[AGE_PART]));
        student.setYearBrday(Integer.parseInt(arrStr[YEAR_PART]));
        return student;
    }

}
