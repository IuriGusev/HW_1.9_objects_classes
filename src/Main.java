public class Main {

//1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и
// годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
//2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//3. Написать конструкторы для обоих классов, заполняющие все поля.
//4. Создать геттеры для всех полей автора и всех полей книги.
//5. Создать сеттер для поля «Год публикации» у книги.
//6. В методе main создать несколько объектов Книга (достаточно двух)
// и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
// Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//
//    Метод main не должен находиться в классах Book и Author.
//
//    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
//
//7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

    public static void main(String[] args) {
        Book Academy = new Book("Academy", 1966, "Isaak Asimov");
        Academy.setPublishYear(1970);
        System.out.println("Название книги = " + Academy.getBookName());
        System.out.println("Год издания = " + Academy.getPublishYear());
        System.out.println("Автор книги = " + Academy.getBookAuthor());

        Book StarshipTroopers = new Book("Starship Troopers", 1959, "Robert Heinlein");
        StarshipTroopers.setPublishYear(1965);
        Author RobertHeinlein = new Author("Robert Heinlein");
        System.out.println(StarshipTroopers.getBookName() + "; " + StarshipTroopers.getPublishYear() + "; " + RobertHeinlein.getNameAuthor());
    }
}