.MODEL SMALL 

fact macro a  
    
    mul a  
        
endm    
 
.STACK 100H

.DATA

n dw 6h

.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

  mov cx,n 
  mov ax,1   
  multiply:
  
     fact cx 
     
  loop multiply
   
  mov bx,dx
  mov cx,ax 
  
   ; here bx:cx holds the factorial of the number
  
     


;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN