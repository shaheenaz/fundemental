package lab6;
public class Review<String> {
    private String body;
    private float numOfStars;
    private String author;

    public float getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(float numOfStars) {
        this.numOfStars = numOfStars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Review(String author , String body , float numOfStars ){


        if (numOfStars > 5){
            this.numOfStars = 5;
        }else if (numOfStars < 0){
            this.numOfStars=0;
        }else {
            this.numOfStars=numOfStars;
        }
        this.author = author;
        this.body = body;

    }



    @Override
    public String toString() {
        return author+ ":" +body+ numOfStars ;
    }
}
