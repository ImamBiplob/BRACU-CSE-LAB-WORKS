.MODEL SMALL
 
.STACK 100H

.DATA 

msg db "Enter any alphabet:$"
a db "Vowel$"
b db "Consonant$"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

    lea dx,msg
    mov ah,9
    int 21h

    mov ah , 1
    int 21h
    
    cmp al , 'A'
    je vowel
    cmp al , 'E'
    je vowel
    cmp al , 'I'
    je vowel
    cmp al , 'O'
    je vowel
    cmp al , 'U'
    je vowel
    
    cmp al , 'a'
    je vowel
    cmp al , 'e'
    je vowel
    cmp al , 'i'
    je vowel
    cmp al , 'o'
    je vowel
    cmp al , 'u'
    je vowel
    
    LEA DX,b 
    mov AH,9 
    int 21h 
    jmp exit
   
   
    vowel:  
    LEA DX,a 
    mov AH,9 
    int 21h 
    
   
    
    
    exit:


 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
  

