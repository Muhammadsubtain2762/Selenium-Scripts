package Google.co.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingGoogleForms {
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 0; i <= 20; i++) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSdnsB0kebzySLqbo9HombKwnNeFruj_PyhRb3LXqaghxRqO7w/viewform");
		
		Thread.sleep(3000);
		
		Random rn = new Random();
		
		// gender
		int gn = rn.nextInt(2 - 1 + 1) + 1;
		String gns = String.valueOf(gn);
		String gnp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+gns+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(gnp)).click();
				
		// Age
		int an = rn.nextInt(2 - 1 + 1) + 1;
		String ans = String.valueOf(gn);
		String anp = "//body/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+ans+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(anp)).click();
		
		
		// Employment Years
		int ey = rn.nextInt(3 - 1 + 1) + 1;
		String eys = String.valueOf(ey);
		String eyp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+eys+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(eyp)).click();
		

		// Promoted or not
		int pon = rn.nextInt(2 - 1 + 1) + 1;
		String pons = String.valueOf(pon);
		String ponp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+pons+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(ponp)).click();
		
		
		// Do you see any prospects of being promoted in the near future
		int dysa = rn.nextInt(2 - 1 + 1) + 1;
		String dysas = String.valueOf(dysa);
		String dysap = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+dysas+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(dysap)).click();
		
		Thread.sleep(500);
		
		// Did your qualifications/skills improved since joining the organisation
		int dyqs = rn.nextInt(2 - 1 + 1) + 1;
		String dyqss = String.valueOf(dyqs);
		String dyqsp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+dyqss+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(dyqsp)).click();
		
		// If "YES", did it help in getting the promotion
		int iyd = rn.nextInt(3 - 1 + 1) + 1;
		String iyds = String.valueOf(iyd);
		String iydp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+iyds+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(iydp)).click();
				
		// Are you willing to leave the organisation in near future
		int ayw = rn.nextInt(2 - 1 + 1) + 1;
		String ayws = String.valueOf(ayw);
		String aywp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+ayws+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(aywp)).click();
		
		// Do you think having good relations with top management leads to promotion
		int dyth = rn.nextInt(2 - 1 + 1) + 1;
		String dyths = String.valueOf(dyth);
		String dythp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[9]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+dyths+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(dythp)).click();
				
				
		// Do you think good performance leads to promotion
		int dytg = rn.nextInt(2 - 1 + 1) + 1;
		String dytgs = String.valueOf(dytg);
		String dytgp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[10]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+dytgs+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(dytgp)).click();
				
				
		// Have you experienced any discrimination regarding promotion
		int hyea = rn.nextInt(2 - 1 + 1) + 1;
		String hyeas = String.valueOf(hyea);
		String hyeap = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[11]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+hyeas+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(hyeap)).click();
				
				
		// Do you think there exists a glass ceiling when it comes to promotion in your organisation
		int dytte = rn.nextInt(3 - 1 + 1) + 1;
		String dyttes = String.valueOf(dytte);
		String dyttep = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[12]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div["+dyttes+"]/label[1]/div[1]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(dyttep)).click();
				
				
		// Morale
		int mn = rn.nextInt(5 - 1 + 1) + 1;
		String mns = String.valueOf(mn);
		String mnp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[14]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/label["+mns+"]/div[2]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(mnp)).click();
				
				
		// Monetary Impact
		int min = rn.nextInt(5 - 1 + 1) + 1;
		String mins = String.valueOf(min);
		String minp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[15]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/label["+mins+"]/div[2]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(minp)).click();
				
		// Physical Health Issues (Weight loss, Fatigue, Obesity, etc.)
		int phi = rn.nextInt(5 - 1 + 1) + 1;
		String phis = String.valueOf(phi);
		String phip = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[16]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/label["+phis+"]/div[2]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(phip)).click();
				
		// Mental Issues (Stress, Anxiety, Depression)
		int mis = rn.nextInt(5 - 1 + 1) + 1;
		String miss = String.valueOf(mis);
		String misp = "/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[17]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/label["+miss+"]/div[2]/div[1]/div[1]/div[3]/div[1]";
		driver.findElement(By.xpath(misp)).click();
		
				
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		Thread.sleep(2500);
		driver.quit();
		}
				
}
}
