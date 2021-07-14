package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Model {
    private int rowCount;
    private int columnCount;
    private CellValue grid[][];
    enum CellValue{
        GROUND , LIMIT , ARCHER,KING, ARENATOWER
    }
    public Model(){
        this.intializeTheGame("C:\\Users\\ali\\IdeaProjects\\FinalProject\\src\\Game\\text");
    }
    public void intializeTheGame(String fileName){
        System.out.println("Initialize2");
        rowCount = 12;
        columnCount = 20;

        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int row = 0 ;
        grid = new CellValue[rowCount][columnCount];
        while(sc.hasNextLine()){
            System.out.println("iam here now");
            int column = 0;
            String line= sc.nextLine();
            System.out.println(line);
            Scanner lineScanner = new Scanner(line);
            int counter = 0 ;
            while (true){
                if (counter==line.length())
                    break;
                char value = line.charAt(counter);
                CellValue thisValue = null;
                switch (value) {
                    case 'G':
                        thisValue = CellValue.GROUND;
                        System.out.println("ground");
                        break;
                    case 'L':
                        thisValue = CellValue.LIMIT;
                        System.out.println("limit");
                        break;
                    case 'A':
                        thisValue = CellValue.ARCHER;
                        System.out.println("arcker");
                        break;
                    case 'D':
                        thisValue = CellValue.ARCHER;
                        break;
                    case 'K':
                        thisValue = CellValue.KING;
                        break;
                    case 'T':
                        thisValue = CellValue.ARENATOWER;
                        break;
                        
                }
                grid[row][column] = thisValue;
                counter++;
                column ++;
            }
            row++;
        }
    }
    public CellValue getCellValue(int row, int column) {
        assert row >= 0 && row < this.grid.length && column >= 0 && column < this.grid[0].length;
        return this.grid[row][column];
    }


}
