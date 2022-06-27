package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports.html",
                "json:target/json-reports/Pcucumber.json",
                "junit:target/xml-report/Pcucumber.xml"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@US024",
        dryRun =false
)
public class Runner {
    //Runner classinin bodysine hiçbir kod yazmiyoruz
    //Bu class icin onemli olan kullanacagimiz iki adet notasyon

    //dryRun=false yazildiginda yukarida belirlenen tag ile etiketlenen tüm senaryolari sirasi ile calistirir
    //dryrun=true dedigimizde ise eksik stepler olup olmadigini kontrol eder
    // ve varsa bize eksik stepleri rapor eder

    //features ve glue olarak specific bir class veya feature dosyasini degil
    // tum klasor ve package i sectik
    //golayisi ile stepdefinitions package'i hangi class da olursa olsun
    //işimize yarayan bir step definition varsa rahatlikla kullanabiliriz


}
