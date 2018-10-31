package com.javatpoint.example.reportcard;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allGrades("puli", 40, 99, 99, 50, 30);
        String finalReport = generateReport();
        //you can also use generateReport().toString();
        //They do not make any change

        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);

        resultTextView.setText(finalReport);



    }




    public String getName() {
        return mName;
    }

    public void setName(String Name) {
        this.mName = Name;
    }

    String mName;
    int mMathGrade;
    int mEnglishGrade;
    int mSocialScienceGrade;
    int mPhysicsGrade;
    int mChemistryGrade ;
    String resultEnglish;
    String resultMath;
    String resultPhysics;
    String resultChemistry;
    String resultSocialScience;

    public int getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(int mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    public int getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(int mEnglishGrade) {
        this.mEnglishGrade = mEnglishGrade;
    }

    public int getSocialScienceGrade() {
        return mSocialScienceGrade;
    }

    public void setSocialScienceGrade(int mSocialScienceGrade) {
        this.mSocialScienceGrade = mSocialScienceGrade;
    }

    public int getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(int mphysicsGrade) {
        this.mPhysicsGrade = mphysicsGrade;
    }

    public int getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(int mChemistryGrade) {
        this.mChemistryGrade = mChemistryGrade;
    }

    public void allGrades(String Name , int EnglishGrade, int MathGrade, int PhysicsGrade, int ChemistryGrade, int SocialScienceGrade){
        this.mName = Name;
        this.mEnglishGrade = EnglishGrade;
        this.mPhysicsGrade = PhysicsGrade;
        this.mChemistryGrade = ChemistryGrade;
        this.mMathGrade = MathGrade;
        this.mSocialScienceGrade = SocialScienceGrade;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String generateReport (){
        return "Name : " + getName() +
                "\nEnglish Grade : " + getEnglishGrade() + "Result : " + getResultEnglish() +
                "\nMaths Grade : " + getMathGrade()+ "Result : " + getResultMath() +
                "\nPhysics Grade : " + getPhysicsGrade() + "Result : " + getResultPhysics() +
                "\nChemistry Grade : " + getChemistryGrade() + "Result : " + getResultChemistry() +
                "\nSocial Science Grade : " + getSocialScienceGrade() + "Result : " + getResultSocialScience()+
                "\nAll the tests are conducted for 100 Marks";
    }

    public String getResultEnglish() {
        if (mEnglishGrade >= 50){
            resultEnglish = "Pass";
        } else resultEnglish = "Fail";
        return resultEnglish;
    }

    public String getResultMath() {
        if (mMathGrade >= 50){
            resultMath = "Pass";
        } else resultMath = "Fail";
        return resultMath;
    }

    public String getResultPhysics() {
        if (mPhysicsGrade >= 50){
            resultPhysics = "Pass";
        } else resultPhysics = "Fail";
        return resultPhysics;
    }

    public String getResultChemistry() {
        if (mChemistryGrade>= 50){
            resultChemistry = "Pass";
        } else resultChemistry = "Fail";
        return resultChemistry;
    }

    public String getResultSocialScience() {
        if (mSocialScienceGrade >= 50){
            resultSocialScience = "Pass";
        } else resultSocialScience = "Fail";
        return resultSocialScience;
    }




}
