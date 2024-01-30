package Jan3;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab13 {

	public static void main(String[] args) {
		
		LocalDate purchaseDate = LocalDate.of(2022, 1, 1);
        int warrantyYears = 2;
        int warrantyMonths = 6;

        printWarrantyExpirationDate(purchaseDate, warrantyYears, warrantyMonths);
    }

    static void printWarrantyExpirationDate(LocalDate purchaseDate, int warrantyYears, int warrantyMonths)
    {
   
        Period warrantyPeriod = Period.ofYears(warrantyYears).plusMonths(warrantyMonths);
        LocalDate expirationDate = purchaseDate.plus(warrantyPeriod);
        System.out.println("Warranty expires on: " + expirationDate);
    }
		
	}

