package Lesson1.HW1;

public class Main {
    public static void main(String[] args) {
//        Lesson1.HW1.Book[] books = new Lesson1.HW1.Book[]{
//                new Lesson1.HW1.Book("Book1", 200, new String[]{"author1", "author2"}, "horror"),
//                new Lesson1.HW1.Book("Book2", 240, new String[]{"author1", "author2"}, "horror"),
//                new Lesson1.HW1.Book("Book3", 300, new String[]{"author1", "author2"}, "horror"),
//                new Lesson1.HW1.Book("Book4", 250, new String[]{"author1", "author2"}, "horror"),
//                new Lesson1.HW1.Book("Book5", 500, new String[]{"author1", "author2"}, "horror"),
//        };
//        Lesson1.HW1.Car[] cars = new Lesson1.HW1.Car[] {
//                new Lesson1.HW1.Car("Audi", 200, 1.6, true),
//                new Lesson1.HW1.Car("BMW", 150, 2.6, true),
//                new Lesson1.HW1.Car("KIA", 102, 1.4, false),
//                new Lesson1.HW1.Car("OKA", 50, 0.5, true),
//                new Lesson1.HW1.Car("LADA", 50, 1.0, false),
//        };
//        Lesson1.HW1.Dog[] dogs = new Lesson1.HW1.Dog[] {
//                new Lesson1.HW1.Dog("max", 5, "retriever"),
//                new Lesson1.HW1.Dog("bobik", 4, "retriever"),
//        };
//
//        for (Lesson1.HW1.Book book: books) {
//            System.out.println(book);
//        }
//        for (Lesson1.HW1.Car car : cars) {
//            System.out.println(car);
//        }
//        for (Lesson1.HW1.Dog dog : dogs) {
//            System.out.println(dog);
//        }
        Post[] posts = new Post[]{
          new Post(1, 1, "id labore ex et quam laborum", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"),
          new Post(1, 2, "quo vero reiciendis velit similique earum", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"),
          new Post(1, 3, "odio adipisci rerum aut animi","quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"),
        };
        Comment[] comments = new Comment[] {
                new Comment(1,1,"id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"),
                new Comment(1,2,"quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"),
                new Comment(1,3,"odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"),
        };
        for (Post post : posts) {
            System.out.println(post);
        }
        for (Comment comment : comments) {
            System.out.println(comment);
        }
      }
    }
