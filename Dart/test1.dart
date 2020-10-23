import 'dart:io';
import 'dart:core';
void main() {
	int inp1 = int.parse(stdin.readLineSync());
	double inp2 = double.parse(stdin.readLineSync());
	String inp3 = stdin.readLineSync();
	print("String: $inp3");
	print("Double: $inp2");
	print("Integer: $inp1");
}