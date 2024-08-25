public class StringTemplates {

    public String getStringTemplate() {
        String name = "World";
        return STR."Welcome \{name}";
    }

    public static void main(String[] args) {
        StringTemplates stringTemplates = new StringTemplates();
        System.out.println(stringTemplates.getStringTemplate());
    }
}