public class Main {
    public static void main(String[] args) {
        // هنا جبنا المصنع الأول (ستايل A)
        UIFactory factoryA = new AFactory();

        // سوينا زر و تكست فيلد و تشيك بوكس من ستايل A
        Button buttonA = factoryA.createButton("OK");
        TextField textFieldA = factoryA.createTextField("Enter name");
        Checkbox checkboxA = factoryA.createCheckbox("Accept");

        // نعرضهم بالشاشة
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        System.out.println();

        // هنا جبنا المصنع الثاني (ستايل B)
        UIFactory factoryB = new BFactory();

        // سوينا زر و تكست فيلد و تشيك بوكس من ستايل B
        Button buttonB = factoryB.createButton("Submit");
        TextField textFieldB = factoryB.createTextField("Enter email");
        Checkbox checkboxB = factoryB.createCheckbox("Subscribe");

        // نعرضهم بالشاشة
        buttonB.display();
        textFieldB.display();
        checkboxB.display();

        System.out.println();

        // هنا جرّبنا نغيّر النص مال الزر الأول
        buttonA.setText("Cancel");
        buttonA.display();
    }
}
