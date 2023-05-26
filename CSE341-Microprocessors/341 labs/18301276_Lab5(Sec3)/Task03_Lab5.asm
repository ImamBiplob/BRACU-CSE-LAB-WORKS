.MODEL SMALL
 
.STACK 100H

.DATA


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov cx,5

Start: 
      mov ah,1
      int 21h
       
      mov ah,2 
      mov dl,0dh    
      int 21h      
      
loop Start 

mov cx,5

PrintX:
      mov ah,2
      mov dl,058h
      int 21h 
      
loop PrintX

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN