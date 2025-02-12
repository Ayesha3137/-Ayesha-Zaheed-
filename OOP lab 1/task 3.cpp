#include<iostream>
#include<string>
using namespace std;
struct Employee{
string name;
int Number;
float Salary;
};
void InputEmployeeData(Employee Employees[], int count) 
{
for (int i = 0; i < count; i++) 
{
cout << "\nEnter details for Employees " << i + 1 << ":\n";
cout << "Name: ";
cin >> Employees[i].name;
cout << " EmployeeNumber: ";
cin >> Employees[i].Number;
cout << "Salary: ";
cin >> Employees[i].Salary;
}
}
void DisplayEmployeeData(Employee Employees[], int count) {
cout << "\n--- Employee's Record ---\n";
for (int i = 0; i < count; i++) {
cout << "Name: " << Employees[i].name << "\n";
cout << "Number: " << Employees[i].Number << "\n";
cout << "Salary: " << Employees[i].Salary << "\n\n";
}
}
void FindHighestSalary(Employee Employees[], int count) {
int topIndex = 0;
for (int i = 1; i < count; i++) {
if (Employees[i].Salary > Employees[topIndex].Salary) {
topIndex = i;
}
}
cout << "\n--- Highest Salary ---\n";
cout << "Name: " << Employees[topIndex].name << "\n";
cout << "Number: " << Employees[topIndex].Number << "\n";
cout << "Salary: " << Employees[topIndex].Salary << "\n";
}
int main() {
int numEmployees;
cout << "Enter the number of employees: ";
cin >> numEmployees;
Employee Employees[numEmployees];
InputEmployeeData(Employees, numEmployees);
DisplayEmployeeData(Employees, numEmployees);
FindHighestSalary(Employees, numEmployees);
return 0;
}
