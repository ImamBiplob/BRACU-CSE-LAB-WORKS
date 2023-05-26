A db 1
B db 2
C db 3
   ;1) 
   ;A=B-A
   
mov al,B
sub al,A
mov A,al

   ;2)
   ;A=-(A+1)
   
mov al,A
add al,1
neg al 
mov A,al

   ;3)
   ;C=A+(B+1)
      
mov al,B
inc al
add A,al
mov ah,A
mov A,ah

   ;4)
   ;A=B-(A-1)
   
mov al,A
dec al
sub B,al
mov ah,B
mov A,ah   