// VtuberNoisesAutomation.cpp 
// This C++ program is used to help generate code for VtuberNoises Projects

#include <iostream>
using namespace std;

int execution_code = 0;

int start_num;
int end_num;
int temp_num;
string vtuber;










void generate_1() {
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To declare boolean variable in MainActivity.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;


    //Declare variable for MainActivity.Java
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "boolean switch" << temp_num + 2 << ";" << endl;
    }
}

void generate_2() {
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To add else if statements in private void startRandomSound() \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;

    //For private void startRandomSound()
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "else if (num == " << temp_num + 2 << ") {" << endl;
        cout << "noise = MediaPlayer.create(this, R.raw." << vtuber << "noise" << temp_num << ");" << endl;
        cout << "noise.setOnCompletionListener(listener);" << endl;
        cout << "noise.start();" << endl;
        cout << "if (switch1) {" << endl;
        cout << "Toast.makeText(this, \"vtuber text\", Toast.LENGTH_SHORT).show();" << endl;
        cout << "}" << endl;
        cout << "set1.start();" << endl;
        cout << "}";
    }
}

void generate_3() {
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To add if statements in private void retrievedata() \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;


    //For private void retrievedata()
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "SavedSettings =getSharedPreferences(\"save" << temp_num + 2 << "\", MODE_PRIVATE);" << endl;
        cout << "switch" << temp_num + 2 << "= SavedSettings.getBoolean(\"value" << temp_num + 2 << "\",true);" << endl;
        cout << "if (switch" << temp_num + 2 << ") {" << endl;
        cout << "listofsounds.add(" << temp_num + 2 << ");" << endl;
        cout << "}";
        cout << endl;
    }
}

void generate_4() {
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To declare Switch variable in ClickerSettings.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;

    //Declare variable for ClickerSettings.Java
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "Switch switch" << temp_num + 2 << ";" << endl;
    }
}


void generate_5() {
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To setup Switches in ClickerSettings.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;

    //For protected void onCreate(Bundle savedInstanceState)
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {

        cout << "// for switch " << temp_num + 2 << " to activate" << endl;
        cout << "switch" << temp_num + 2 << "=findViewById(R.id.switch" << temp_num + 2 << ");" << endl;
        cout << "SoundSettings =getSharedPreferences(\"" << temp_num + 2 << "\",MODE_PRIVATE);" << endl;
        cout << "switch" << temp_num + 2 << ".setChecked(SoundSettings.getBoolean(\"value" << temp_num + 2 << "\",true));" << endl;
        cout << "switch" << temp_num + 2 << ".setOnClickListener(new View.OnClickListener() {" << endl;
        cout << "@Override" << endl;
        cout << "public void onClick(View v) {" << endl;
        cout << "if(switch" << temp_num + 2 << ".isChecked()){" << endl;
        cout << "SoundSettingsEditor =getSharedPreferences(\"save" << temp_num + 2 << "\",MODE_PRIVATE).edit();" << endl;
        cout << "SoundSettingsEditor.putBoolean(\"value" << temp_num + 2 << "\",true);" << endl;
        cout << "SoundSettingsEditor.apply();" << endl;
        cout << "switch" << temp_num + 2 << ".setChecked(true);" << endl;
        cout << "}else{" << endl;
        cout << "SoundSettingsEditor =getSharedPreferences(\"save" << temp_num + 2 << "\",MODE_PRIVATE).edit();" << endl;
        cout << "SoundSettingsEditor.putBoolean(\"value23\",false);" << endl;
        cout << "SoundSettingsEditor.apply();" << endl;
        cout << "switch" << temp_num + 2 << ".setChecked(false);" << endl;
        cout << "}" << endl;
        cout << "}" << endl;
        cout << "});" << endl;
        cout << endl;

    }
}


void generate_6() {
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << "For clicker_settings.xml \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << endl;

    for (temp_num = start_num; temp_num <= end_num; temp_num++) {

        cout << "<TableRow" << endl;
        cout << "android:layout_marginBottom=\"5dp\"" << endl;
        cout << "android:paddingLeft=\"10dp\"" << endl;
        cout << "android:layout_width=\"match_parent\"" << endl;
        cout << "android:layout_height=\"match_parent\">" << endl;
        cout << "" << endl;
        cout << "<TextView" << endl;
        cout << "android:layout_weight=\"1\"" << endl;
        cout << "android:layout_width=\"wrap_content\"" << endl;
        cout << "android:layout_height=\"wrap_content\"" << endl;
        cout << "android:text=\"vtuber text\"" << endl;
        cout << "android:textColor=\"#f1f1f1\"" << endl;
        cout << "android:textSize=\"17sp\" />" << endl;
        cout << "" << endl;
        cout << "<Switch" << endl;
        cout << "android:id=\"@+id/switch" << temp_num + 2 << "\"" << endl;
        cout << "android:layout_width=\"match_parent\"" << endl;
        cout << "android:layout_height=\"match_parent\" />" << endl;
        cout << "" << endl;
        cout << "</TableRow>" << endl;
        cout << endl;

    }
}


void generate_7() {
    //For README file
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << "For Documentation in README \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << endl;

    //loops to generate (vtuber)noise(number) for documentation
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << vtuber << "noise" << temp_num << " " << endl;
    }

}





















int main()
{
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "////////////////////////////////////" << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "Vtuber Noises C++ Automation Program" << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "////////////////////////////////////" << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << endl;



    //Prompt user for Vtuber name
    cout << "Enter the Vtuber's name : ";
    cin >> vtuber;

    //Prompt user for the starting and ending number of the noises
    cout << "Enter the starting number for the noises : ";
    cin >> start_num;
    cout << "Enter the ending number for the noises : ";
    cin >> end_num;

    cout << "\n\n\n";

    while (execution_code != 99) {
        cout << "Select an option from menu :" << endl;


        cout << "~~~~~~~~~ For MainActivity.Java ~~~~~~~~~" << endl;
        cout << "1. Generate boolean variable (boolean switch)" << endl;
        cout << "2. Generate else if statements for private void startRandomSound()" << endl;
        cout << "3. Generate if statements in private void retrievedata()" << endl;


        cout << "~~~~~~~~~ For ClickerSettings.Java ~~~~~~~~~" << endl;
        cout << "4. Generate Switch variable (Switch switch)" << endl;
        cout << "5. Generate setup code for Switches" << endl;


        cout << "~~~~~~~~~ For clicker_settings.xml ~~~~~~~~~" << endl;
        cout << "6. Generate switches for xml file" << endl;


        cout << "~~~~~~~~~ For Documentation ~~~~~~~~~" << endl;
        cout << "7. Generate Documentation for README" << endl;


        cout << "~~~~~~~~~" << endl;
        cout << "99. Exit to Desktop" << endl;
        cout << "~~~~~~~~~" << endl;
        cin >> execution_code;

        if (execution_code==1) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_1();
            cout << "\n\n\n";
        }
        else if (execution_code == 2) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_2();
            cout << "\n\n\n";
        }
        else if (execution_code == 3) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_3();
            cout << "\n\n\n";
        }
        else if (execution_code == 4) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_4();
            cout << "\n\n\n";
        }
        else if (execution_code == 5) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_5();
            cout << "\n\n\n";
        }
        else if (execution_code == 6) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_6();
            cout << "\n\n\n";
        }
        else if (execution_code == 7) {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
            generate_7();
            cout << "\n\n\n";
        }
        else if (execution_code == 99) {
            cout << "\n\n\n\n\n";
            cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
            cout << "Program has ended successfully" << endl;
            cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
            cout << "Exit Code : 99" << endl;
            break;
        }
        else {
            cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
        }



    }
    /*
    //For README file
    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << "For Documentation in README \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << endl;
    
    //loops to generate (vtuber)noise(number) for documentation
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << vtuber<<"noise" << temp_num << " " << endl;
    }



    //FOR MAIN ACTIVITY

    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << "For MainActivity.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << endl;

    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To declare boolean variable in MainActivity.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;


    //Declare variable for MainActivity.Java
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "boolean switch" << temp_num +2 <<";" << endl;
    }


    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To add else if statements in private void startRandomSound() \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;

    //For private void startRandomSound()
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "else if (num == " << temp_num + 2 << ") {" << endl;
        cout << "noise = MediaPlayer.create(this, R.raw."<<vtuber<<"noise" << temp_num << ");" << endl;
        cout << "noise.setOnCompletionListener(listener);" << endl;
        cout << "noise.start();" << endl;
        cout << "if (switch1) {" << endl;
        cout << "Toast.makeText(this, \"vtuber text\", Toast.LENGTH_SHORT).show();" << endl;
        cout << "}" << endl;
        cout << "set1.start();" << endl;
        cout << "}";
    }

    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To add if statements in private void retrievedata() \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;


    //For private void retrievedata()
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "SavedSettings =getSharedPreferences(\"save" << temp_num + 2 << "\", MODE_PRIVATE);" << endl;
        cout << "switch" << temp_num + 2 << "= SavedSettings.getBoolean(\"value" << temp_num + 2 << "\",true);" << endl;
        cout << "if (switch" << temp_num + 2 << ") {" << endl;
        cout << "listofsounds.add(" << temp_num + 2 << ");" << endl;
        cout << "}";
        cout << endl;
    }


    //FOR CLICKER SETTINGS


    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << "For ClickerSettings.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << endl;

    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To declare Switch variable in ClickerSettings.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;

    //Declare variable for ClickerSettings.Java
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {
        cout << "Switch switch" << temp_num + 2 << ";" << endl;
    }

    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << "To setup Switches in ClickerSettings.Java \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n";
    cout << endl;
    
    //For protected void onCreate(Bundle savedInstanceState)
    for (temp_num = start_num; temp_num <= end_num; temp_num++) {

        cout << "// for switch "<< temp_num + 2 <<" to activate" << endl;
        cout << "switch" << temp_num + 2 << "=findViewById(R.id.switch" << temp_num + 2 << ");" << endl;
        cout << "SoundSettings =getSharedPreferences(\"" << temp_num + 2 << "\",MODE_PRIVATE);" << endl;
        cout << "switch" << temp_num + 2 << ".setChecked(SoundSettings.getBoolean(\"value" << temp_num + 2 << "\",true));" << endl;
        cout << "switch" << temp_num + 2 << ".setOnClickListener(new View.OnClickListener() {" << endl;
        cout << "@Override" << endl;
        cout << "public void onClick(View v) {" << endl;
        cout << "if(switch" << temp_num + 2 << ".isChecked()){" << endl;
        cout << "SoundSettingsEditor =getSharedPreferences(\"save" << temp_num + 2 << "\",MODE_PRIVATE).edit();" << endl;
        cout << "SoundSettingsEditor.putBoolean(\"value" << temp_num + 2 << "\",true);" << endl;
        cout << "SoundSettingsEditor.apply();" << endl;
        cout << "switch" << temp_num + 2 << ".setChecked(true);" << endl;
        cout << "}else{" << endl;
        cout << "SoundSettingsEditor =getSharedPreferences(\"save" << temp_num + 2 << "\",MODE_PRIVATE).edit();" << endl;
        cout << "SoundSettingsEditor.putBoolean(\"value23\",false);" << endl;
        cout << "SoundSettingsEditor.apply();" << endl;
        cout << "switch" << temp_num + 2 << ".setChecked(false);" << endl;
        cout << "}" << endl;
        cout << "}" << endl;
        cout << "});" << endl;
        cout << endl;

    }


    cout << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << "For clicker_settings.xml \n";
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout << endl;

    for (temp_num = start_num; temp_num <= end_num; temp_num++) {

        cout << "<TableRow" << endl;
        cout << "android:layout_marginBottom=\"5dp\"" << endl;
        cout << "android:paddingLeft=\"10dp\"" << endl;
        cout << "android:layout_width=\"match_parent\"" << endl;
        cout << "android:layout_height=\"match_parent\">" << endl;
        cout << "" << endl;
        cout << "<TextView" << endl;
        cout << "android:layout_weight=\"1\"" << endl;
        cout << "android:layout_width=\"wrap_content\"" << endl;
        cout << "android:layout_height=\"wrap_content\"" << endl;
        cout << "android:text=\"vtuber text\"" << endl;
        cout << "android:textColor=\"#f1f1f1\"" << endl;
        cout << "android:textSize=\"17sp\" />" << endl;
        cout << "" << endl;
        cout << "<Switch" << endl;
        cout << "android:id=\"@+id/switch" << temp_num + 2 << "\"" << endl;
        cout << "android:layout_width=\"match_parent\"" << endl;
        cout << "android:layout_height=\"match_parent\" />" << endl;
        cout << "" << endl;
        cout << "</TableRow>" << endl;
        cout << endl;

    }


    cout <<"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    cout <<"Program has ended successfully"<< endl;
    cout <<"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

    */
}


