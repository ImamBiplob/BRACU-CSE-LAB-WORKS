.MODEL SMALL
 
.STACK 100H

.DATA 

 a db "Maximum:$"
 b db "Minimum:$"

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here  

  mov ah,1
  int 21h
  
  mov ch,al   ; ch for storing maximum number
  mov cl,al   ; cl for storing minimum number
  
  mov ah,1
  int 21h
  
  cmp al,ch
  jg max1
  
  mov cl,al
  
  mov ah,1
  int 21h
  
  cmp al,ch
  jg max2
  
  cmp al,cl
  jl min
  jmp exit
  
  
  max1:
  mov ch,al
  
  mov ah,1
  int 21h
  
  cmp al,ch
  jg max2
  
  cmp al,cl
  jl min 
  jmp exit
  
  min:
  mov cl,al
  jmp exit 
  
  max2:
  mov ch,al
  jmp exit 
   
  exit: 
  
  lea dx,a
  mov ah,9
  int 21h
  
  mov dl,ch
  mov ah,2
  int 21h
  
  
  lea dx,b
  mov ah,9
  int 21h
  
  mov dl,cl
  mov ah,2
  int 21h 
   
   
;exit to DOS  
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 
  

