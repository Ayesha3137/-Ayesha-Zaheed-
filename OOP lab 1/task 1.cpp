#include <iostream>
using namespace std;
double convertKilometersToMiles(double kilometers) 
{
return kilometers * 0.621;
}
double convertCelsiusToFahrenheit(double celsius) 
{
return (celsius * 9 / 5) + 32;
}
void convertSecondsToTime(int seconds) 
{
int hours = seconds / 3600;
seconds %= 3600;
int minutes = seconds / 60;
seconds %= 60;
cout << hours << " hours, " << minutes << " minutes, " << seconds << " seconds." << endl;
}
int main() 
{
int choice;
do 
{
cout << "Measurement Conversion Menu:" << endl;
cout << "1. Convert Kilometers to Miles" << endl;
cout << "2. Convert Celsius to Fahrenheit" << endl;
cout << "3. Convert Seconds into Hours, Minutes, and Seconds" << endl;
cout << "4. Exit" << endl;
cout << "Enter your choice (1-4): ";
cin >> choice;
if (choice == 1) 
{
double kilometers;
cout << "Enter the distance in kilometers: ";cin >> kilometers;
double miles = convertKilometersToMiles(kilometers);
cout << kilometers << " kilometers is equal to " << miles << " miles." << endl;
} 
else if (choice == 2) 
{
double celsius;
cout << "Enter the temperature in Celsius: ";
cin >> celsius;
double fahrenheit = convertCelsiusToFahrenheit(celsius);
cout << celsius << " Celsius is equal to " << fahrenheit << " Fahrenheit." << endl;
}
else if (choice == 3) 
{
int seconds;
cout << "Enter the time in seconds: ";
cin >> seconds;
cout << seconds << " seconds is equal to ";
convertSecondsToTime(seconds);}
else if (choice == 4) 
{
cout << "Exiting the program..." << endl;
} 
else 
{
cout << "Invalid choice. Please enter a number between 1 and 4." << endl;
}
} 
while (choice != 4);
return 0;
}
