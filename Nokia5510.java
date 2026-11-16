import java.util.Scanner;
public class Nokia5510 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("---------MENU FUNCTIONS----------\n1.PHONE BOOK\n2.MESSAGES\n3.CHAT\n4.CALL REGISTER\n5.TONES\n6.SETTINGS\n7.CALL DIVERT\n8.MUSIC\n9.GAMES\n10.CALCULATOR\n11.REMINDERS\n12.CLOCK\n13.PROFILES\n14.SERVICES\n15.SIM SERVICES\n");
		System.out.println("Enter your choice here: ");
		int choice = input.nextInt();
		switch(choice){
			case 1:
				System.out.println("\n-------PHONE BOOK OPTIONS------\n1.SEARCH\n2.SERVICE NOS.\n3.ADD NAME\n4.ERASE\n5.EDIT\n6.COPY\n7.ASSIGN TONE\n8.EDIT B'CARD\n9.OPTIONS\n10.SPEED DIALS\n11.VOICE TAGS\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\nSearched Successfully"); break;
					case 2: System.out.println("\n07019524261"); break;
					case 3: System.out.println("\nName added Successfully"); break;
					case 4: System.out.println("\nErased Successfully"); break;
					case 5: System.out.println("\nEdited Successfully"); break;
					case 6: System.out.println("\ncopied Successfully"); break;
					case 7: System.out.println("\nTone assigned Successfully"); break;
					case 8: System.out.println("\nSent Successfully"); break;
					case 9:
						System.out.println("\n------OPTIONS MENU------\n1.MEMORY IN USE\n2.TYPE OF VIEW\n3.MEMORY STATUS\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\nPhone memory"); break;
							case 2: System.out.println("\nDefault View"); break;
							case 3: System.out.println("\nHalf full"); break;
						}
						break;
					case 10: System.out.println("\nSpeed dial Successful"); break;
					case 11: System.out.println("\nTagged voice Successfully"); break;
				}
				break;


				
			case 2:
				System.out.println("\n--------MESSAGES MENU------\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\nMessage written and Sent successfully"); break;
					case 2: System.out.println("\ninbox is empty"); break;
					case 3: System.out.println("\nOutbox is empty"); break;
					case 4: System.out.println("\npicture message sent Successfully"); break;
					case 5: System.out.println("\nTemplates entered"); break;
					case 6: System.out.println("\nsmileys sent Successfully"); break;
					case 7:
						System.out.println("\n---------MESSAGE SETTINGS-------\n1.SET 1\n2.COMMON\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1:
								System.out.println("\n---------SET 1 SETTINGS-------\n1.Message centre number\n2.Message sent as\n3.Message validity\n");
								System.out.println("Enter your choice here: ");
								choice = input.nextInt();
								switch(choice){
									case 1: System.out.println("\n07019524261"); break;
									case 2: System.out.println("\nTexts"); break;
									case 3: System.out.println("\nValid!!"); break;
								}
								break;
							case 2:
								System.out.println("\n---------COMMON SETTINGS-------\n1.Delivery reports\n2.Reply via the same centre\n3.Character support\n");
								System.out.println("Enter your choice here: ");
								choice = input.nextInt();
								switch(choice){
									case 1: System.out.println("\nDelivery Successful"); break;
									case 2: System.out.println("\nON"); break;
									case 3: System.out.println("\nON"); break;
								}
								break;
						}
						break;
					case 8: System.out.println("\nInfo service Successfully"); break;
					case 9: System.out.println("\nVoiced mailbox number Successfully"); break;
					case 10: System.out.println("\nService command Edited Successfully"); break;
				}
				break;


				
			case 3: System.out.println("\nChat Succesful!!"); break;


				
			case 4:
				System.out.println("\n--------CALL REGISTER MENU------\n1. Missed calls\n2. Received calls\n3. Dialled numbers\n4. Erase recent call list\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\nYou have 7 Missed calls"); break;
					case 2: System.out.println("\nYou have 7 Recieved calls"); break;
					case 3: System.out.println("\n07019524261\n08123456731\n09076564540"); break;
					case 4: System.out.println("\nRecent call list Erased Successfully"); break;
					case 5:
						System.out.println("\n---------CALL DURATION OPTIONS-------\n1.Last call duration\n2.All calls' duration\n3.Received calls' duration\n4.Dialled calls' duration\n5.Clear timers\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n7 mins"); break;
							case 2: System.out.println("\n28 mins"); break;
							case 3: System.out.println("\n8 mins"); break;
							case 4: System.out.println("\nDialled calls' duration checked"); break;
							case 5: System.out.println("\nTimers cleared successfully"); break;
						}
						break;
					case 6:
						System.out.println("\n---------CALL COST OPTIONS-------\n1.Last call cost\n2.All calls' cost\n3.Clear counters\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n105 naira"); break;
							case 2: System.out.println("\n105 naira"); break;
							case 3: System.out.println("\ncounters cleared successfully"); break;
						}
						break;
					case 7:
						System.out.println("\n---------CALL COST SETTINGS-------\n1.Call cost limit\n2.Show costs in\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\n7000 naira"); break;
							case 2: System.out.println("\nNaira"); break;
						}
						break;
					case 8: System.out.println("\n700 naira"); break;
				}
				break;


				
				case 5:
				System.out.println("\n--------TONES MENU------\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Message alert tone\n5. Keypad tones\n6. Warning tones\n7. Vibrating alert\n8. Screen saver\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\nElixir"); break;
					case 2: System.out.println("\n8"); break;
					case 3: System.out.println("\nIncoming call answered successfully"); break;
					case 4: System.out.println("\nDefault tone"); break;
					case 5: System.out.println("\nDefault tone"); break;
					case 6: System.out.println("\nDefault tone"); break;
					case 7: System.out.println("\nDefault Alert"); break;
					case 8: System.out.println("\nJpg 1"); break;
				}
				break;
				case 6:
				System.out.println("\n--------SETTINGS MENU------\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1:
						System.out.println("\n---------CALL SETTINGS OPTIONS-------\n1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sendng\n5.Phone line in use\n6.Automatic answer\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\nOFF"); break;
							case 2: System.out.println("\nON"); break;
							case 3: System.out.println("\nON"); break;
							case 4: System.out.println("\nOFF"); break;
							case 5: System.out.println("\n0725346321"); break;
							case 6: System.out.println("\nOFF"); break;
						}
						break;


							
					case 2:
						System.out.println("\n---------PHONE SETTINGS OPTIONS-------\n1.Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Confirm SIM service actions\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\nEnglish"); break;
							case 2: System.out.println("\nON"); break;
							case 3: System.out.println("\nNokia welcomes you to its new phone"); break;
							case 4: System.out.println("\nMTN"); break;
							case 5: System.out.println("\nConfirmed"); break;
						}
						break;
					case 3:
						System.out.println("\n---------SECURITY SETTINGS OPTIONS-------\n1.PIN code request\n2.Call barring service\n3.Fixed dialling\n4.Closed user group\n5.Security level\n6.Change access codes\n");
						System.out.println("Enter your choice here: ");
						choice = input.nextInt();
						switch(choice){
							case 1: System.out.println("\nrequested successfully"); break;
							case 2: System.out.println("\nON"); break;
							case 3: System.out.println("\nON"); break;
							case 4: System.out.println("\nON"); break;
							case 5: System.out.println("\nHIGH"); break;
							case 6: System.out.println("\nChanged Successfully"); break;
						}
						break;
					case 4: System.out.println("\nFactory reset successful"); break;
				}
				break;
			case 7: System.out.println("\nCall Diverted"); break;
			case 8:
				System.out.println("\n--------MUSIC MENU------\n1. Music player\n2. Radio\n3. Recorder\n4. Track list\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\nMusic playing successfully"); break;
					case 2: System.out.println("\nRadio playing successfully"); break;
					case 3: System.out.println("\nRecording..."); break;
					case 4: System.out.println("\nFavour by lawrence oyor"); break;
				}
				break;
			case 9: System.out.println("\nGames coming soon"); break;
			case 10: System.out.println("\nCalculated successfully"); break;
			case 11: System.out.println("\nReminder set"); break;
			case 12:
				System.out.println("\n--------CLOCK MENU------\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time\n");
				System.out.println("Enter your choice here: ");
				choice = input.nextInt();
				switch(choice){
					case 1: System.out.println("\nAlarm set"); break;
					case 2: System.out.println("\nCLock set"); break;
					case 3: System.out.println("\nDate set"); break;
					case 4: System.out.println("\nStopwatch started successfully"); break;
					case 5: System.out.println("\ncountdown started successfully"); break;
					case 6: System.out.println("\nDate and Time updated"); break;
				}
				break;
			case 13: System.out.println("\nProfile set successfully"); break;
			case 14: System.out.println("\nservices contacted successfully"); break;
			case 15: System.out.println("\nMTN services contacted successfully"); break;
		}
	}
}   
