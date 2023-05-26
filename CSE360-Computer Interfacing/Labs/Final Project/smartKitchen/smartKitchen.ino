int PIRpin =2;
int MQ2pin =8;
int TEMPpin =A0;
int LAMPpin =12;
int FANpin =7;
int BUZZERpin =13;

int PIRval =0;
int MQ2val =0;
int TEMPval =0;

void setup() {
  Serial.begin(9600);
  pinMode(PIRpin,INPUT);
  pinMode(MQ2pin,INPUT);
  pinMode(TEMPpin,INPUT);
  pinMode(LAMPpin,OUTPUT);
  pinMode(FANpin,OUTPUT);
  pinMode(BUZZERpin,OUTPUT);

  // put your setup code here, to run once:

}

void loop() {
  PIRval = digitalRead(PIRpin);
  MQ2val = digitalRead(MQ2pin);
  TEMPval = analogRead(TEMPpin);
  TEMPval = TEMPval/2.0741;

  if(PIRval == HIGH) {
    digitalWrite(LAMPpin,HIGH);
  }
  else{
    digitalWrite(LAMPpin,LOW);
  }
  if(MQ2val == HIGH) {
    tone(BUZZERpin,1000,500);
  }
 
  if(TEMPval > 30) {
    digitalWrite(FANpin,HIGH);
  }
  else {
    digitalWrite(FANpin,LOW);
  }
  Serial.println(TEMPval);
  Serial.println(MQ2val);
  Serial.println(PIRval);

  delay(1000);
  // put your main code here, to run repeatedly:

}
