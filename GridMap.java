import java.util.*;
import java . io .*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

//Pair class
class Pair<A, B>{
	public A First;
	public B Second;
	public Pair(){

    }
	public Pair(A _first, B _second) {
        this.First = _first;
        this.Second = _second;
    }
    public A get_first() {
        return First;
    }
    public B get_second() {
        return Second;
    }
}

 
public class GridMap {
    
    public static BufferedImage mars;
    public static BufferedImage metal;
    public static BufferedImage black;
    public static BufferedImage trophy;
    public static BufferedImage crashBoard;
    public static BufferedImage robotr;
    public static BufferedImage robotl;
    public static BufferedImage robotd;
    public static BufferedImage robotu;
    public static BufferedImage robotucrash;
    public static BufferedImage robotdcrash;
    public static BufferedImage robotlcrash;
    public static BufferedImage robotrcrash;
    public static BufferedImage coin;
    public static TexturePaint marstp;
    public static TexturePaint metaltp;
    public static TexturePaint blacktp;
    
    // Loading image like mars texture
    public static void loadImages() {

        try {

            mars = ImageIO.read(new File("supportingImages/mars.jpg"));
            metal = ImageIO.read(new File("supportingImages/metal.jpg"));
            black = ImageIO.read(new File("supportingImages/black.jpg"));
            trophy = ImageIO.read(new File("supportingImages/trophy.png"));
            crashBoard = ImageIO.read(new File("supportingImages/crash.png"));
            robotr = ImageIO.read(new File("supportingImages/robotr.png"));
            robotl = ImageIO.read(new File("supportingImages/robotl.png"));
            robotd = ImageIO.read(new File("supportingImages/robotd.png"));
            robotu = ImageIO.read(new File("supportingImages/robotu.png"));
            robotucrash = ImageIO.read(new File("supportingImages/robotucrash.png"));
            robotdcrash = ImageIO.read(new File("supportingImages/robotdcrash.png"));
            robotlcrash = ImageIO.read(new File("supportingImages/robotlcrash.png"));
            robotrcrash = ImageIO.read(new File("supportingImages/robotrcrash.png"));
            coin = ImageIO.read(new File("supportingImages/coin.png"));

        } catch (IOException ex) {
            Logger.getLogger(GridMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Drawing the map
    public static void createGrid(int width, int height, int cellSize, Graphics2D g) {
        marstp = new TexturePaint(mars, new Rectangle(0, 0, 90, 60));
        g.setPaint(marstp);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.BLACK);
        for (int i = 0; i < width; i += cellSize) {
            g.drawLine(i, 0, i, height);
        }
        for (int i = 0; i < height; i += cellSize) {
            g.drawLine(0, i, width, i);
        }
    }

    // Placing the obstacles on the map  
    public static void placeObstacle(int x, int y, int cellSize, Graphics2D g) {
        blacktp = new TexturePaint(black, new Rectangle(0, 0, 90, 60));
        g.setPaint(blacktp);
        g.fillRect(x*cellSize, y*cellSize, cellSize, cellSize);
    }

    // Placing the robot on the map
    public static void placeRobot(int Locx, int Locy,int cellSize, Graphics2D g, int direction,boolean crash) {
        if (direction == 0 && crash == false) {
            g.drawImage(robotu,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 1 && crash == false) {
            g.drawImage(robotd,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 2 && crash == false) {
            g.drawImage(robotl,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 3 && crash == false) {
            g.drawImage(robotr,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 0 && crash == true){
            g.drawImage(robotucrash,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 1 && crash == true){
            g.drawImage(robotdcrash,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 2 && crash == true){
            g.drawImage(robotlcrash,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        } else if (direction == 3 && crash == true){
            g.drawImage(robotrcrash,Locx,Locy, Locx+cellSize, Locy+cellSize,0, 0, 500, 500, null);
        }
        // metaltp = new TexturePaint(metal, new Rectangle(0, 0, 90, 60));
        // g.setPaint(metaltp);
        // if(direction == 0){
        //     g.fillPolygon(new int[] {Locx, Locx+cellSize/2, Locx+cellSize, Locx+3*cellSize/4 , Locx+cellSize/2, Locx+cellSize/4 },
        //               new int[] {Locy+cellSize,Locy, Locy+cellSize,Locy+cellSize,Locy+cellSize/4,Locy+cellSize }, 6);
            
        // }
        // else if(direction == 1){
        //     g.fillPolygon(new int[] {Locx, Locx+cellSize/2, Locx+cellSize, Locx+3*cellSize/4 , Locx+cellSize/2, Locx+cellSize/4 },
        //               new int[] {Locy,Locy+cellSize, Locy,Locy,Locy+3*cellSize/4,Locy }, 6);
            
        // }
        // else if(direction == 2){
        //     g.fillPolygon(new int[] {Locx+cellSize,Locx, Locx+cellSize,Locx+cellSize,Locx+cellSize/4,Locx+cellSize },
        //               new int[] {Locy, (Locy)+cellSize/2, Locy+cellSize, Locy+3*cellSize/4 , (Locy)+cellSize/2, Locy+cellSize/4 }, 6);        

        // }
        // else{
        //     g.fillPolygon(new int[] {Locx,Locx+cellSize, Locx,Locx,Locx+3*cellSize/4,Locx },
        //               new int[] {Locy, (Locy)+cellSize/2, Locy+cellSize, Locy+3*cellSize/4 , (Locy)+cellSize/2, Locy+cellSize/4 }, 6);
        // }        
    }

    // Placing the goal on the map
    public static void placeGoal(int x, int y, int cellSize, Graphics2D g) {
        g.drawImage(trophy,x*cellSize,y*cellSize, (x+1)*cellSize, (y+1)*cellSize,0, 0, 500, 500, null);
    }

    public static void placeCrashboard(int x, int y, int cellSize, Graphics2D g) {
        g.drawImage(crashBoard,0,0, (x)*cellSize, (y)*cellSize,0, 0, 500, 500, null);
    }


    // Placing the coin on the map
    public static void placeCoin(int x, int y, int cellSize, Graphics2D g) {
        g.drawImage(coin,x*cellSize,y*cellSize, (x+1)*cellSize, (y+1)*cellSize,0, 0, 500, 500, null);
    }

    public static void checker(int x,int y,List<Pair<Integer,Integer>> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i).First==x && list.get(i).Second==y){
                list.remove(i);
            }
        }
    }

    public static boolean crashChecker(int x,int y,List<Pair<Integer,Integer>> list, int width,int height,int cellSize,int direction){
        for(int i=0;i<list.size();i++){
            if((direction==1 || direction == 3) && list.get(i).First==(x+80)/cellSize && list.get(i).Second==(y+80)/cellSize){
                return true;
            }
            if((direction==0 || direction == 2) && list.get(i).First==(x+20)/cellSize && list.get(i).Second==(y+20)/cellSize){
                return true;
            }
        }
        if(x+20<0 || x+80>=width || y+20<0 || y+80>=height){
            System.out.println(x);
            System.out.println(width);
            return true;
        }
        return false;
    }

    public static String repeatS(String s, int n){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s);
        }
        return sb.toString();
    }

    public static String transform(String s){
        if (s.contains("[")==false){
            return s;
        }
        else{
            Integer firstB = s.indexOf("[");
            Integer lastB = 0;
            Integer openingbr = 0;
            Integer closingbr = 0;
            for(int i = firstB; i<s.length();i++){
                if(s.charAt(i)=='['){
                    openingbr++;
                }
                else if(s.charAt(i)==']'){
                    closingbr++;
                    if(openingbr==closingbr){
                        lastB = i;
                        break;
                    }
                }
            }
            Integer number = Integer.parseInt(s.substring(firstB-1,firstB));
            String s1 = s.substring(0,firstB-1);
            String s2 = s.substring(lastB+1,s.length());
            String s3 = s.substring(firstB+1,lastB);
            return s1+repeatS(transform(s3),number)+transform(s2);
        }

    }

    
 
    public static void main(String[] args) throws IOException {

        int cellSize = 100;
        List<Pair<Integer,Integer>> coins = new ArrayList<Pair<Integer,Integer>>();
        List<Pair<Integer,Integer>> obst = new ArrayList<Pair<Integer,Integer>>();
        boolean goal_is = false;
        boolean crash = false;
        Integer Goal_X = 0;
        Integer Goal_Y = 0;
        Integer Robot_X = 0;
        Integer Robot_Y = 0;
        Integer Robot_Dir = 0;
        Integer Y_Curr = 0 ;
        Integer horizontal = 0;
        Integer vertical = 0;
        Integer counter = 0;
        String path = "";
        try{
            FileInputStream fstream1 = new FileInputStream ("path.txt");
			Scanner s1 = new Scanner ( fstream1 );
            path = transform(s1.nextLine());
			FileInputStream fstream = new FileInputStream ("grid.txt");
			Scanner s = new Scanner ( fstream );
			while(s.hasNextLine ()){
				String input = s.nextLine();
                horizontal = input.length();
                for (int i = 0; i < input.length(); i++){
                    if(input.charAt(i) == 'X'){
                        Pair<Integer,Integer> pn = new Pair<Integer,Integer>();
                        pn.First = i;
			            pn.Second = Y_Curr;
                        obst.add(pn);
                    }
                    if(input.charAt(i) == 'G'){
                        Goal_X = i;
                        Goal_Y = Y_Curr;
                        goal_is = true;
                    }
                    if(input.charAt(i) == 'U'){
                        Robot_X = i*cellSize;
                        Robot_Y = Y_Curr*cellSize;
                        Robot_Dir = 0;
                    }
                    if(input.charAt(i) == 'D'){
                        Robot_X = i*cellSize;
                        Robot_Y = Y_Curr*cellSize;
                        Robot_Dir = 1;
                    }
                    if(input.charAt(i) == 'L'){
                        Robot_X = i*cellSize;
                        Robot_Y = Y_Curr*cellSize;
                        Robot_Dir = 2;
                    }
                    if(input.charAt(i) == 'R'){
                        Robot_X = i*cellSize;
                        Robot_Y = Y_Curr*cellSize;
                        Robot_Dir = 3;
                    }
                    if(input.charAt(i) == '+'){
                        Pair<Integer,Integer> pn = new Pair<Integer,Integer>();
                        pn.First = i;
			            pn.Second = Y_Curr;
                        coins.add(pn);
                    }
                }
                Y_Curr++;
			}
		}
		catch(FileNotFoundException e){
			System . out . println (" File not found ");
		}
        vertical = Y_Curr;
        int width = horizontal*cellSize;
        int height = vertical*cellSize;
        loadImages();
 
        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
 
        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();
 
        createGrid(width, height, cellSize, g2d);
        placeRobot(Robot_X,Robot_Y,cellSize,g2d,Robot_Dir,crash);
        if(goal_is){
            placeGoal(Goal_X,Goal_Y,cellSize,g2d);
        }
        for (int i = 0; i < obst.size(); i++){
            placeObstacle(obst.get(i).First,obst.get(i).Second,cellSize,g2d);
        }
        for (int i = 0; i < coins.size(); i++){
            placeCoin(coins.get(i).First,coins.get(i).Second,cellSize,g2d);
        }
        
 
        // Disposes of this graphics context and releases any system resources that it is using. 
        g2d.dispose();
 
        // Save as PNG
        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i)=='F'){ 
                for(int j = 0; j < cellSize; j+=5 ){
                    // Constructs a BufferedImage of one of the predefined image types.
                    BufferedImage bufferedImagel = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            
                    // Create a graphics which can be used to draw into the buffered image
                    Graphics2D g2dl = bufferedImagel.createGraphics();
                    createGrid(width, height, cellSize, g2dl);
                    if(Robot_Dir ==0){
                        Robot_Y-=5;
                    }
                    else if (Robot_Dir ==1){
                        Robot_Y+=5;
                    }
                    else if (Robot_Dir ==2){
                        Robot_X-=5;
                    }
                    else if (Robot_Dir ==3){
                        Robot_X+=5;
                    }
                    if(Robot_Dir==1 || Robot_Dir == 3){
                        checker((Robot_X+40)/cellSize,(Robot_Y+40)/cellSize,coins);
                    }
                    else{
                        checker((Robot_X+60)/cellSize,(Robot_Y+60)/cellSize,coins);
                    }                    
                    crash = crashChecker(Robot_X,Robot_Y,obst,width,height,cellSize,Robot_Dir);
                    placeRobot(Robot_X,Robot_Y,cellSize,g2dl,Robot_Dir,crash);
                    if(goal_is){
                        placeGoal(Goal_X,Goal_Y,cellSize,g2dl);
                    }
                    for (int k = 0; k < obst.size(); k++){
                        placeObstacle(obst.get(k).First,obst.get(k).Second,cellSize,g2dl);
                    }
                    for (int k = 0; k < coins.size(); k++){
                        placeCoin(coins.get(k).First,coins.get(k).Second,cellSize,g2dl);
                    }
                    if(crash){
                        placeCrashboard(horizontal,vertical,cellSize,g2dl);
                    }
                    // Disposes of this graphics context and releases any system resources that it is using. 
                    g2dl.dispose();            
                    // Save as PNG
                    File filel = new File("myimage"+String.format("%04d", counter)+".png");
                    ImageIO.write(bufferedImagel, "png", filel);
                    counter++;        
                    if(crash){
                        break;
                    }
                }       
            }
            else if(path.charAt(i)=='B'){
                for(int j = 0; j < cellSize; j+=5 ){
                    // Constructs a BufferedImage of one of the predefined image types.
                    BufferedImage bufferedImagel = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            
                    // Create a graphics which can be used to draw into the buffered image
                    Graphics2D g2dl = bufferedImagel.createGraphics();
                    createGrid(width, height, cellSize, g2dl);
                    if(Robot_Dir ==0){
                        Robot_Y+=5;
                    }
                    else if (Robot_Dir ==1){
                        Robot_Y-=5;
                    }
                    else if (Robot_Dir ==2){
                        Robot_X+=5;
                    }
                    else if (Robot_Dir ==3){
                        Robot_X-=5;
                    }
                    //Make correction here
                    if(Robot_Dir==1 || Robot_Dir == 3){
                        checker((Robot_X+40)/cellSize,(Robot_Y+40)/cellSize,coins);
                    }
                    else{
                        checker((Robot_X+60)/cellSize,(Robot_Y+60)/cellSize,coins);
                    }    
                    crash = crashChecker(Robot_X,Robot_Y,obst,width,height,cellSize,Robot_Dir);
                    placeRobot(Robot_X,Robot_Y,cellSize,g2dl,Robot_Dir,crash);
                    if(goal_is){
                        placeGoal(Goal_X,Goal_Y,cellSize,g2dl);
                    }
                    for (int k = 0; k < obst.size(); k++){
                        placeObstacle(obst.get(k).First,obst.get(k).Second,cellSize,g2dl);
                    }
                    for (int k = 0; k < coins.size(); k++){
                        placeCoin(coins.get(k).First,coins.get(k).Second,cellSize,g2dl);
                    }
                    if(crash){
                        placeCrashboard(horizontal,vertical,cellSize,g2dl);
                    }
                    // Disposes of this graphics context and releases any system resources that it is using. 
                    g2dl.dispose();            
                    // Save as PNG
                    File filel = new File("myimage"+String.format("%04d", counter)+".png");
                    ImageIO.write(bufferedImagel, "png", filel);
                    counter++;   
                    if(crash){
                        break;
                    }     
                }    
                
            }
            else if(path.charAt(i)=='R'){

                BufferedImage bufferedImagel = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);            
                // Create a graphics which can be used to draw into the buffered image
                Graphics2D g2dl = bufferedImagel.createGraphics();
                createGrid(width, height, cellSize, g2dl);
                if(Robot_Dir ==0){
                    Robot_Dir = 3;
                }
                else if (Robot_Dir ==1){
                    Robot_Dir = 2;
                }
                else if (Robot_Dir ==2){
                    Robot_Dir = 0;
                }
                else if (Robot_Dir ==3){
                    Robot_Dir = 1;
                }
                placeRobot(Robot_X,Robot_Y,cellSize,g2dl,Robot_Dir,crash);
                if(goal_is){
                    placeGoal(Goal_X,Goal_Y,cellSize,g2dl);
                }
                for (int k = 0; k < obst.size(); k++){
                    placeObstacle(obst.get(k).First,obst.get(k).Second,cellSize,g2dl);
                }
                for (int k = 0; k < coins.size(); k++){
                        placeCoin(coins.get(k).First,coins.get(k).Second,cellSize,g2dl);
                    }
                // Disposes of this graphics context and releases any system resources that it is using. 
                g2dl.dispose();            
                // Save as PNG
                File filel = new File("myimage"+String.format("%04d", counter)+".png");
                ImageIO.write(bufferedImagel, "png", filel);
                counter++;
            
                
            }
            else{
                BufferedImage bufferedImagel = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);            
                // Create a graphics which can be used to draw into the buffered image
                Graphics2D g2dl = bufferedImagel.createGraphics();
                createGrid(width, height, cellSize, g2dl);
                if(Robot_Dir ==0){
                    Robot_Dir = 2;
                }
                else if (Robot_Dir ==1){
                    Robot_Dir = 3;
                }
                else if (Robot_Dir ==2){
                    Robot_Dir = 1;
                }
                else if (Robot_Dir ==3){
                    Robot_Dir = 0;
                }
                placeRobot(Robot_X,Robot_Y,cellSize,g2dl,Robot_Dir,crash);
                if(goal_is){
                        placeGoal(Goal_X,Goal_Y,cellSize,g2dl);
                    }
                for (int k = 0; k < obst.size(); k++){
                    placeObstacle(obst.get(k).First,obst.get(k).Second,cellSize,g2dl);
                }
                for (int k = 0; k < coins.size(); k++){
                        placeCoin(coins.get(k).First,coins.get(k).Second,cellSize,g2dl);
                    }
                // Disposes of this graphics context and releases any system resources that it is using. 
                g2dl.dispose();            
                // Save as PNG
                File filel = new File("myimage"+String.format("%04d", counter)+".png");
                ImageIO.write(bufferedImagel, "png", filel);
                counter++;
            
            }
            if(crash){
                break;
            }
        }
        try{
            System.out.println("Starting Execution");
            Runtime.getRuntime().exec("ffmpeg -r 20 -i myimage%04d.png -pix_fmt yuv420p movie.mp4");
            System.out.println("Execution done");
        }
        catch(Exception ex){
            System.out.println("Invalid command");
        }
 
    }
 
}