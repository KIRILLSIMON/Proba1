public class Main {
    public static void main(String[] args) {

        Author gogol= new Author("Николай","Гоголь");
        Author gogol1= new Author("Николай","Гоголь");
        Author gogol2= gogol;
        Author tolstoy=new Author("Лев","Толстой");

        Book revisor= new Book("Ревизор", gogol,1775);
        Book warAndPiece=new Book("Война и мир",tolstoy,1835);
        Book nouse=new Book("Нос",gogol,1836);
        System.out.println(nouse.getAuthorName());
        System.out.println(revisor.getTitle()+" "+revisor.getAuthorSurname()+" "
                +revisor.getPublishingYear());
        System.out.println(warAndPiece.getTitle()+" "+warAndPiece.getAuthorSurname()+" "
                +warAndPiece.getPublishingYear());
        nouse.setPublishingYear(1836);
        System.out.println(nouse.getTitle()+" "+nouse.getAuthorSurname()+" "
                +nouse.getPublishingYear());
        System.out.println(gogol.toString());
        System.out.println(gogol.hashCode());
        System.out.println(gogol.equals(tolstoy));
        System.out.println(nouse);
        System.out.println(gogol.getClass().getName()+"@"+Integer.toHexString(gogol.hashCode()));
        System.out.println(gogol2==gogol);
        System.out.println(gogol==gogol2);
        System.out.println(gogol2.equals(gogol));
        System.out.println(gogol.equals(gogol2));
        System.out.println(gogol.hashCode());
        System.out.println(gogol2.hashCode());
        System.out.println(warAndPiece.hashCode());
        System.out.println(nouse.hashCode());

    }
}
