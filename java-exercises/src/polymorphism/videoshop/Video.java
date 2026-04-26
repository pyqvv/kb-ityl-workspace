package polymorphism.videoshop;

public class Video extends Content {
  String genre;

  Video(String title, String genre) {
    super(title);
    this.genre = genre;
  }

  void totalPrice(){
    switch (genre) {
      case "new" -> setPrice(2000);
      case "comic" -> setPrice(1500);
      case "child" -> setPrice(1000);
      default -> setPrice(500);
    }
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
