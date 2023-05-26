.MODEL SMALL
 
.STACK 100H

.DATA 


a db "Odd$"
b db "Even$"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

    mov ah, 1
    int 21h
    mov ah, 0
    mov bl, 2
    div bl
    
   
    cmp ah, 1
    je ODD
    
    
   
    lea dx, b
    mov ah, 9
    int 21h
    jmp EXIT
    
    ODD:
    
    
    lea dx, a
    mov ah, 9
    int 21h
    jmp EXIT
    
    
    exit:

    
    
    
    



 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
  

