.MODEL SMALL
 
.STACK 100H

.DATA

a db 5 dup(?) 


.CODE 
MAIN PROC 

;initialize DS

MOV AX,@DATA 
MOV DS,AX 
 
; enter your code here

mov cx,5
mov ah,1
mov si,0

input:
      int 21h
      mov a[si],al 
      mov bx,si
      sort: 
           cmp bx,0
           je sortdone 
           compare:
           mov di,bx
           dec di
           mov dh,a[di]
           mov dl,a[bx]
           cmp dh,dl
           jng comparedone 
          
           mov a[di],dl
           mov a[bx],dh
           comparedone:
           dec bx
           jmp sort
      sortdone:     
      inc si           
loop input 

mov cx,5
mov ah,2
mov si,0

print:
      mov dl,a[si]
      int 21h
      inc si
      
loop print      

      

;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN