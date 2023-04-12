public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book();
        warAndPeace.authorName = "Л. Н. Толстой";
        warAndPeace.bookName = "Война и мир";
        warAndPeace.publishingYear = 1867;
        System.out.println("Автор - " + warAndPeace.authorName);
        System.out.println("Название - " + warAndPeace.bookName);
        System.out.println("Год публикации - " + warAndPeace.publishingYear);

        Car coolCar = new Car();
        System.out.println(coolCar.speed);
        coolCar.color = "Red";
    }
}


