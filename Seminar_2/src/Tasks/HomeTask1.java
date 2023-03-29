package Tasks;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class HomeTask1 {

    private static Logger log = Logger.getLogger(HomeTask1.class.getName());
    static {
        log.setLevel(Level.FINE);
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("logger.log", 2000, 5);
            fileHandler.setFormatter(new SimpleFormatter());
            //setting custom filter for FileHandler
            log.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
//        log.config("handlers = java.util.logging.FileHandler");
//        log.config("java.util.logging.FileHandler.pattern = application_log.txt");
//        log.config("java.util.logging.FileHandler.formatter = java.util.logging.SimpleFormatter");
//        log.config("java.util.logging.FileHandler.level     = INFO");
//        log.config("java.util.logging.FileHandler.append    = false");
    }

    public static void bubleSort(int[] arr){
        log.log(Level.INFO, "Original array -> " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            log.log(Level.INFO, "Iteration " + Integer.toString(i) + " -> " + Arrays.toString(arr));
        }
    }
}
