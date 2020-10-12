public class Test {

    public static void main(String[] args) {

        ResponsiblePerson person1 = new ResponsiblePerson("Jan", "Kowalski");
        ResponsiblePerson person2 = new ResponsiblePerson("Marek", "Kwiatkowski");


        TODO task1 = new TODO("Exercise3", "Create to do app", 1, person1);
        task1.showTODOinfo();
        task1.showInfoPriority();


        TODO task2 = new TODO("Clean house", "Nothing to describe", -1);
        task2.showTODOinfo();
        task2.showInfoPriority();


        TODO task3 = new TODO("Tickets", "Buy flight tickets to warsaw", 0, person2);
        task3.showTODOinfo();
        task3.showInfoPriority();


        TODO task4 = new TODO("Shoping", "Buy fruits", 23);
        task4.showTODOinfo();
        task4.showInfoPriority();

    }
}
