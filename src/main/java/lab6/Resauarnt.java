package lab6;
import com.google.common.collect.ArrayListMultimap;

import java.util.*;
    public class Resauarnt {
        private String name;
        private float numOfStars;
        private float price;
        private int  sum = 0;
        private int counter =0;

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }

        private ArrayList<Review> review = new ArrayList<Review>();

        public Resauarnt(String name, float price) {
            this.name = name;
            this.price = price;
        }

        public void authorReview(String author, String body, float stars) {
            Review newreview = new Review(author, body, stars);
            this.sum = (int) (sum + newreview.getNumOfStars());
            this.counter+=1;
            this.numOfStars= this.sum/counter;
            this.review.add(newreview);



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
            return "name" + name + "satrts " + numOfStars + "review:" + review;
        }
    }

