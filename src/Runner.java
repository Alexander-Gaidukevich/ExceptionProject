import java.nio.file.FileAlreadyExistsException;

public class Runner {

    public static void main(String[] args) {

        try {
            calc();
        } catch (ArithmeticException exeption) {
            System.out.println("была отловлена ошибка: " + exeption);
        } catch (ArrayIndexOutOfBoundsException exeption) {
            System.out.println("была отловлена ошибка во 2  " + exeption);
        } catch (FileAlreadyExistsException exeption) {
            System.out.println("file уже существует.....");
        }

        finally {
            System.out.println("finaaaaaaaly");//код который всегда выполнится, неважно была ошибка или нет
        }

        System.out.println("fgmdgdnk");

    }

    public static void calc() throws ArrayIndexOutOfBoundsException, FileAlreadyExistsException {

        int a = 3;
        int b = 1;
        int d = a / b;//вылетает ошибка

        System.out.println("d ==== " + d);

        throw new FileAlreadyExistsException("hhhh");   //обязательно Throwable или потомок

        //FileAlreadyExistsException - проверяемое исключение

    }
}
