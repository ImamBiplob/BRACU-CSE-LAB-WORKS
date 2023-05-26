.MODEL SMALL
 
.STACK 100H

.DATA 

a db "It is divisible by 5 and 11$"
b db "It is not divisible by 5 and 11$"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

    mov cx , 55 ; 55 is the number
    mov bh , 5
    mov bl , 11
    
    mov ax,cx
    div bh
    cmp ah , 0
    je div11
    jmp no
    
    div11:
        mov ax , cx
        div bl
        cmp ah , 0
        je yes
        jmp no
        
    yes:
        
        lea dx, a
        mov ah, 9
        int 21h
        jmp exit 
        
    no:
        lea dx, b
        mov ah, 9
        int 21h
        jmp exit
        
    exit:
    

 

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
  

