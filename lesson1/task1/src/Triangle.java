public class Triangle {
       public static void main(String[] args) {
           Triangle triangle = new Triangle(3, 4, 5); //To change out the values of the sides, put teh small value, then the medium, then the large
           triangle.printTriangle();
           System.out.println("Is it a triangle? True or false?: " + triangle.isTriangle());
           System.out.println("Is it a right angle triangle? True or false: " + triangle.isRightTriangle());
           System.out.println("The perimeter is: " + triangle.perimeter());
           System.out.println("The area is: " + triangle.area());
           //Main method above tests the code
       }




            //The instance variables >>>
            private double sSide; //Creates the small side instance variable
            private double mSide; //Creates the medium side instance variable
            private double lSide; //Creates the largest side instance variable

        public Triangle() { //Default constructor that sets the value of the sides
                this.sSide = 3;
                this.mSide = 4;
                this.lSide = 5;
            }

            //This constructor now includes parameters
        public Triangle( double side1, double side2, double side3){
                double[] sides = {side1, side2, side3}; //The array will order the sides into small, medium and large.
                //I got a fair bit of help from Jack for this part with the arrays here
                this.sSide = sides[0];
                this.mSide = sides[1];
                this.lSide = sides[2];
            }

            public double getSSide () { //This is an accessor gets the small side
                return sSide;
            }

            public double getMSide () { //This is an accessor gets the medium side
                return mSide;
            }

            public double getLSide () { //This is an accessor gets the large side
                return lSide;
            }


            public void setSSide ( double sSide){ //This mutator sets the small side
                this.sSide = sSide;
            }

            public void setMSide ( double mSide){ //This mutator sets the medium side
                this.mSide = mSide;
            }

            public void setLSide ( double lSide){ //This mutator sets the large side
                this.lSide = lSide;
            }

            public boolean isTriangle () {
                return sSide + mSide > lSide; //This method will check if it's a triangle
                //I had to use Jack's help again for this bit
            }

            //This method below will now check if it's a right angle triangle
            public boolean isRightTriangle () {
                double tolerance = 0.1;
                return Math.abs((sSide * sSide) + (mSide * mSide) - (lSide * lSide)) <= tolerance;
            }

            //The method below calculates the perimeter
            public double perimeter () {
                return sSide + mSide + lSide;
            }

            //This method will calculate the triangle's area
            public double area () {
                double p = perimeter() / 2;
                return Math.sqrt(p * (p - sSide) * (p - mSide) * (p - lSide)); //This line is Heron's formula
            }

            //This final method will print the resulting sides
            public void printTriangle () {
                System.out.println("Smallest side: " + sSide);
                System.out.println("Medium side: " + mSide);
                System.out.println("Largest side: " + lSide);
            }


    }
