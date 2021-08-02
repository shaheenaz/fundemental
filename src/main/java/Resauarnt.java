
import java.util.*;
    public class Resauarnt {
        private String name;
        private float numOfStars;
        private float price;
        private int  sum = 0;
        private ArrayList<Review> review = new ArrayList<Review>();

        public Resauarnt(String name, float price) {
            this.name = name;
            this.price = price;
        }

        public void authorReview(String author, String body, float stars) {
            Review newreview = new Review(author, body, stars);
            this.sum = (int) (sum + newreview.getNumOfStars());



        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getNumOfStars() {
            return numOfStars;
        }

        public void setNumOfStars(float numOfStars) {
            this.numOfStars = numOfStars;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public ArrayList<Review> getReview() {
            return review;
        }

        public void setReview(ArrayList<Review> review) {
            this.review = review;
        }

        @Override
        public String toString() {
            return "name" + name + "satrts " + numOfStars;
        }
    }

