import java.util.Scanner;

public class Nokia5510 {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("""
	---------MENU FUNCTIONS----------
	1.PHONE BOOK
	2.MESSAGES
	3.CHAT
	4.CALL REGISTER
	5.TONES
	6.SETTINGS
	7.CALL DIVERT
	8.MUSIC
	9.GAMES
	10.CALCULATOR
	11.REMINDERS
	12.CLOCK
	13.PROFILES
	14.SERVICES
	15.SIM SERVICES
	""");
	System.out.println("Enter your choice here: ");
	int choice = input.nextInt();

		switch(choice){
			case 1:
			System.out.println("""
			-------PHONE BOOK OPTIONS------
			1.SEARCH
			2.SERVICE NOS.
			3.ADD NAME
			4.ERASE
			5.EDIT
			6.COPY
			7.ASSIGN TONE
			8.EDIT B'CARD
			9.OPTIONS
			10.SPEED DIALS
			11.VOICE TAGS
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();

				switch(choice){
					case 1:System.out.println("Number searched successfully");break;
					case 2:System.out.println("07036322837");break;
					case 3:System.out.println("Name=Kamdilinna Akosionu");break;
					case 4:System.out.println("Number erased successfully");break;
					case 5:System.out.println("Numbers edited successfully");break;
					case 6:System.out.println("Number copied successfully");break;
					case 7:System.out.println("Tone assigned successfully");break;
					case 8:System.out.println("B'day card sent successfully");break;
					case 9:
					System.out.println("""
					------OPTIONS MENU------
					1.MEMORY IN USE
					2.TYPE OF VIEW
					3.MEMORY STATUS
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();
						switch(choice){
							case 1:System.out.println("Memory in use checked successfully");break;
							case 2:System.out.println("Type of view checked successfully");break;
							case 3:System.out.println("Memory status checked successfully");break;
						}
					break;
					case 10:System.out.println("Speed dials checked successfully");break;
					case 11:System.out.println("Voice tags checked successfully");break;
				}
			break;
			case 2:
			System.out.println("""
			--------MESSAGES MENU------
			1. Write messages 
			2. Inbox
			3. Outbox 
			4. Picture messages 
			5. Templates 
			6. Smileys
			7. Message settings
			8. Info service 
			9. Voice mailbox number 
			10. Service command editor 
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();
			
				switch(choice){
					case 1:System.out.println("Message written successfully");break;
					case 2:System.out.println("Inbox entered successfully");break;
					case 3:System.out.println("Outbox entered successfully");break;
					case 4:System.out.println("Picture messages entered");break;
					case 5:System.out.println("Templates entered");break;
					case 6:System.out.println("Smileys entered");break;
					case 7:
						System.out.println("""
						---------MESSAGE SETTINGS-------
						1.SET 1
						2.COMMON
						""");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();

							switch(choice){
								case 1:
								System.out.println("""
								---------SET 1 SETTINGS-------
								1.Message centre number
								2.Message sent as
								3.Message validity
								""");
								System.out.println("Enter your choice here: ");
								choice = input.nextInt();

									switch(choice){
										case 1:System.out.println("Message number centre checked");break;
										case 2:System.out.println("Messages sent as...");break;
										case 3:System.out.println("Message validity checked");break;
									}
								break;
								case 2:
								System.out.println("""
								---------COMMON SETTINGS-------
								1.Delivery reports
								2.Reply via the same centre
								3.Character support
								""");
								System.out.println("Enter your choice here: ");
								choice = input.nextInt();

									switch(choice){
										case 1:System.out.println("Delivery reports opened");break;
										case 2:System.out.println("You have replied with the same centre");break;
										case 3:System.out.println("Character support provided");break;
									}
								break;
							}
					break;
					case 8:System.out.println("Info service provided");break;
					case 9:System.out.println("Voice mailbox number checked");break;
					case 10:System.out.println("Service command editor checked");break;
				}
			break;
			case 3:System.out.println("Chat opened successfully");break;
			case 4:
			System.out.println("""
			--------CALL REGISTER MENU------
			1. Missed calls 
			2. Received calls
			3. Dialled numbers
			4. Erase recent call list 
			5. Show call duration
			6. Show call costs
			7. Call cost settings
			8. Prepaid credit
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();

				switch(choice){
					case 1:System.out.println("Missed calls checked");break;
					case 2:System.out.println("Received calls checked");break;
					case 3:System.out.println("Dialled numbers checked");break;
					case 4:System.out.println("Recent call list erased");break;
					case 5:
					System.out.println("""
					---------CALL DURATION OPTIONS-------
					1.Last call duration
					2.All calls' duration
					3.Received calls' duration
					4.Dialled calls' duration
					5.Clear timers
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();

						switch(choice){
							case 1:System.out.println("Last call duration checked");break;
							case 2:System.out.println("All calls' duration checked");break;
							case 3:System.out.println("Received calls' duration checked");break;
							case 4:System.out.println("Dialled calls' duration checked");break;
							case 5:System.out.println("Timers cleared");break;
						}
					break;
					case 6:
					System.out.println("""
					---------CALL COST OPTIONS-------
					1.Last call cost
					2.All calls' cost
					3.Clear counters
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();

						switch(choice){
							case 1:System.out.println("Last call cost checked");break;
							case 2:System.out.println("All calls' cost checked");break;
							case 3:System.out.println("Counters cleared");break;
						}
					break;
					case 7:
					System.out.println("""
					---------CALL COST SETTINGS-------
					1.Call cost limit
					2.Show costs in
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();

						switch(choice){
							case 1:System.out.println("Call cost limit configured");break;
							case 2:System.out.println("Costs showed");break;
						}
					break;
					case 8:System.out.println("Prepaid credit cecked");break;
				}
			break;
			case 5:
			System.out.println("""
			--------TONES MENU------
			1. Ringing tone
			2. Ringing volume
			3. Incoming call alert
			4. Message alert tone 
			5. Keypad tones
			6. Warning tones
			7. Vibrating alert
			8. Screen saver
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();

				switch(choice){
					case 1:System.out.println("Ringing tone set");break;
					case 2:System.out.println("Ringing volume set");break;
					case 3:System.out.println("Incoming call tone set");break;
					case 4:System.out.println("Message alert tone set");break;
					case 5:System.out.println("Keypad tone set");break;
					case 6:System.out.println("Warning tone set");break;
					case 7:System.out.println("Vibrating alert tone set");break;
					case 8:System.out.println("Screen saver set");break;
				}
			break;
			case 6:
			System.out.println("""
			--------SETTINGS MENU------
			1. Call settings
			2. Phone settings
			3. Security settings
			4. Restore factory settings
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();

				switch(choice){
					case 1:
					System.out.println("""
					---------CALL SETTINGS OPTIONS-------
					1.Automatic redial
					2.Speed dialling
					3.Call waiting options
					4.Own number sendng
					5.Phone line in use
					6.Automatic answer
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();

						switch(choice){
							case 1:System.out.println("Automatic redial configured");break;
							case 2:System.out.println("Speed dialling configured");break;
							case 3:System.out.println("Call waiting options selected");break;
							case 4:System.out.println("Own number sent");break;
							case 5:System.out.println("Phone line to use selected");break;
							case 6:System.out.println("Automatic answer chosen");break;
						}
					break;
					case 2:
					System.out.println("""
					---------PHONE SETTINGS OPTIONS-------
					1.Language
					2.Cell info display
					3.Welcome note
					4.Network selection
					5.Confirm SIM service actions
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();

						switch(choice){
							case 1:System.out.println("Language chosen");break;
							case 2:System.out.println("Cell info display configured");break;
							case 3:System.out.println("Welcome note set");break;
							case 4:System.out.println("Network selected");break;
							case 5:System.out.println("SIM service actions confirmed");break;
						}
					break;
					case 3:
					System.out.println("""
					---------SECURITY SETTINGS OPTIONS-------
					1.PIN code request
					2.Call barring service
					3.Fixed dialling
					4.Closed user group
					5.Security level
					6.Change access codes
					""");
					System.out.println("Enter your choice here: ");
					choice = input.nextInt();

						switch(choice){
							case 1:System.out.println("PIN code provided");break;
							case 2:System.out.println("Call barring service activated");break;
							case 3:System.out.println("Fixed dialling activated");break;
							case 4:System.out.println("Closed user group set");break;
							case 5:System.out.println("Security level determined");break;
							case 6:System.out.println("Access codes changed");break;
						}
					break;
					case 4:System.out.println("Factory settings restored");
				}
			break;
			case 7:System.out.println("Call divert setting has been activated");break;
			case 8:
			System.out.println("""
			--------MUSIC MENU------
			1. Music player
			2. Radio
			3. Recorder
			4. Track list
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();

				switch(choice){
					case 1:System.out.println("Music player opened");break;
					case 2:System.out.println("Radio opened");break;
					case 3:System.out.println("Recorder opened");break;
					case 4:System.out.println("Track list made");break;
				}
			break;
			case 9:System.out.println("NOKIA games are opened");break;
			case 10:System.out.println("Phone calculator has been activated");break;
			case 11:System.out.println("Reminders have been set");break;
			case 12:
			System.out.println("""
			--------CLOCK MENU------
			1. Alarm clock
			2. Clock settings
			3. Date setting
			4. Stopwatch
			5. Countdown timer
			6. Auto update of date and time
			""");
			System.out.println("Enter your choice here: ");
			choice = input.nextInt();

				switch(choice){
					case 1:System.out.println("Alarm clock opened");break;
					case 2:System.out.println("Clock settings opened");break;
					case 3:System.out.println("Date settings opened");break;
					case 4:System.out.println("Stopwatch opened");break;
					case 5:System.out.println("Countdown timer opened");break;
					case 6:System.out.println("Date and time updated automatically");break;
				}
			break;
			case 13:System.out.println("You have entered the Profiles dashboard");break;	
			case 14:System.out.println("You have entered the Services dashboard");break;
			case 15:System.out.println("You have entered the SIM Services dashboard");break;
		}

	
	

	}
}
