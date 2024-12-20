public class EBook extends Book{
    private String downloadUrl;

    public EBook(String title, String author, String downloadLink){
        super(title, author);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadLink(){
        return downloadLink;
    }

    public String getDownloadUrl(){
        return downloadUrl;
    }

    @Override
    public String toString(){
        return super.toString() + "下載連結 : " + downloadUrl;
    }
}
