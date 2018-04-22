public class NameValidateTest {
    private static NameValidate nameValidate;
    public static String [] isNameValidate = new String[]{"C9876H","P3456K"};
    public static String [] inisNamevalidate = new String[]{"T3456g","G4567K"};

    public static void main(String[] args) {
        nameValidate = new NameValidate();
        for (String name:isNameValidate) {
            boolean isvalidateName = nameValidate.isvalidate(name);
            System.out.println("class "+name+" is: "+isvalidateName);
        }
        System.out.println();
        for (String name:inisNamevalidate) {
            boolean isvalidateName = nameValidate.isvalidate(name);
            System.out.println("class "+name+" is: "+isvalidateName);
        }
    }
}
