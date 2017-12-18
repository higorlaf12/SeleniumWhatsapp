package com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium;

import com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

import static com.example.EstrururandoSelenium.EstruturandoSelenium.PageObjectsSelenium.StructureSelenium.VariablesStrings.VariablesStrings.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Title("Hreports test")
public class PageTest {

    private static PageLogin pageLogin;
    private static PageBase pageBase = new PageBase();

    @AfterClass
    public static void finishingProject() {
        closeNavegator();
    }

    private static void closeNavegator() {
        pageBase.closeNavegator();
    }

    @Before
    public void init() {
        accessUrl();
    }

    @Title("Page Login Success")
    @Description("Make sure the user enters the correct password and the identifier")
    @Test
    public void setPageLoginSuccess() throws Exception {
        userLog();
        Thread.sleep(1000);
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Title("Page Login Error")
    @Description("Make sure the user enters the wrong password or identifier")
    @Test
    public void setPageLoginError() throws Exception {
        userLogError();
        Thread.sleep(1000);
    }
    @Severity(SeverityLevel.CRITICAL)
    @Title("Page Login Exit")
    @Description("will enter with the authenticated user, soon after will leave system ")
    @Test
    public void setPageLoginExit() throws Exception {
        userLog();
        userLogExit();
        Thread.sleep(1000);
    }

    @Title("Page Edit Cadaster with Success")
    @Description("Will edit a user")
    @Test
    public void setPageEditCadastreSuccess() throws Exception {
        userLog();
        userEditPersonal();
        Thread.sleep(1000);
    }

    @Title("Page Report")
    @Description("Enters the report and verifies that all have been answered")
    @Test
    public void setPageReport() throws Exception {
        userLog();
        userReport();
        userLogExit();
        Thread.sleep(1000);
    }

    @Title("Page Administration")
    @Description("Administrator to configure the position, competence, department , weight tables and the user")
    @Test
    public void setPageAdministration() throws Exception {
        userLog();
        userAdministration();
        userLogExit();
        Thread.sleep(1000);
    }

    @Title("Page of Search")
    @Description("Page search where it will look for the user")
    @Test
    public void setPageSearch() throws Exception{
        userLog();
        userSearch();
        userLogExit();
        Thread.sleep(1000);
    }

    @Title("Page Search Report")
    @Description("Page search report where you will do research for a group particular, individual ou public ")
    @Test
    public void setPageSearchReport() throws Exception{
        userLog();
        userPageSearchReport();
        userLogExit();
        Thread.sleep(1000);
    }
    @Title("Page Answer")
    @Description("answering the forms")
    @Test
    public void setPageZOneAnswer() throws Exception{
        userLog();
        userAnswer();
        userLogExit();
    }

    private void accessUrl() {
        pageBase.navegateTo("http://localhost:8080/#/hreports/login");
    }

    @Step("Process login")
    private void userLog() throws Exception {
        pageLogin = new PageLogin(pageBase.getDriver());
        pageLogin.enterPageLogin(EMAIL_LOGIN, PASSWORD_LOGIN);
    }

    @Step("Process error login")
    private void userLogError() throws Exception {
        pageLogin = new PageLogin(pageBase.getDriver());
        pageLogin.errorPageLogin(EMAIL_LOGIN_ERROR, PASSWORD_LOGIN_ERROR);
    }
    @Step("Process exit login")
    private void userLogExit() throws Exception {
        pageLogin = new PageLogin(pageBase.getDriver());
        pageLogin.exitPageLogin();
    }
    @Step("Process edit personal ")
    private void userEditPersonal() throws Exception {
        PageEditCadastre pageEditCadastre = new PageEditCadastre(pageBase.getDriver());
        pageEditCadastre.enterEditCadastre();
        pageEditCadastre.setUpPersonalData(EDIT_NAME, EDIT_EMAIL, EDIT_CPF);
        pageEditCadastre.profileUser(EDIT_NAME, PASSWORD_LOGIN, PASSWRD_NEW);
    }
    @Step("Process report user")
    private void userReport() throws Exception {
        PageReport pageReport = new PageReport(pageBase.getDriver());
        pageReport.clickReport();
    }
    @Step("Process of administration")
    private void userAdministration() throws Exception {
        PageAdministration pageAdministration = new PageAdministration(pageBase.getDriver());
        pageAdministration.allMethod(FRONT_END, COMPETENCE, DEPARTMENT,USER_NAME);
    }
    @Step("Process of search user")
    private void userSearch()throws Exception{
        PageSearch pageSearch = new PageSearch(pageBase.getDriver());
        pageSearch.searchInProgress(EDIT_NAME);
    }
    @Step("Process to ask a question")
    private void userPageSearchReport()throws Exception{
        PageSearchReport pageSearchReport = new PageSearchReport(PageBase.getDriver());
        pageSearchReport.searchReportCreateCapa(QUESTION);

    }
    @Step("Process in which it presents the user's response")
    private void userAnswer()throws Exception{
        PageAnswer pageAnswer = new PageAnswer(PageBase.getDriver());
        pageAnswer.answer();
    }

}
