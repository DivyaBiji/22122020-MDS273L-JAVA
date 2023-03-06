Question

Below is an encryption/decryption standard in which the letters in the message will be replaced with the letters in the cypher row.
Plain	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z
Cypher	X	Y	Z	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W
Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.

How the code works:
The program contains two static methods, encrypt and decrypt, which perform the encryption and decryption operations, respectively. These methods take a String message as input, and return the encrypted or decrypted message as a String.
The main method is the entry point of the program. It contains a menu-driven program that allows the user to choose between encryption, decryption, or exiting the program. It uses a do-while loop to repeatedly display the menu and accept user input until the user chooses to exit.
The Scanner class is used to read input from the user via the console. The nextInt and nextLine methods are used to read integers and strings, respectively, from the user.
In the switch statement, the choice variable is used to determine which operation to perform. If the user chooses encryption, the program prompts the user for the message to encrypt, calls the encrypt method to encrypt the message, and prints the encrypted message to the console. If the user chooses decryption, the program prompts the user for the message to decrypt, calls the decrypt method to decrypt the message, and prints the decrypted message to the console. If the user chooses to exit, the program prints a goodbye message and terminates. If the user chooses an invalid option, the program prints an error message and displays the menu again.
The encrypt and decrypt methods both use the substitution cipher shown in the prompt to perform the encryption and decryption operations. The plain and cypher variables represent the plain alphabet and the corresponding cypher alphabet, respectively. The message and encryptedMessage variables are used to store the input message and the encrypted/decrypted message, respectively. The toUpperCase method is used to convert the input message to uppercase, to ensure that it only contains uppercase letters. The charAt method is used to retrieve the character at a specific position in the string, and the indexOf method is used to find the index of a character in a string. The for loop is used to iterate over each character in the message, and perform the corresponding substitution operation.
Overall, the program is a simple implementation of the substitution cipher, with a menu-driven interface for user interaction.