from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

std_id = input("Enter your ID: ")

last_digit = int(std_id[-1])
def coin_toss():

    if (last_digit % 2 == 0):
        x1, y1 = (150, 350)
        x2, y2 = (350, 350)
        DDA1(x1, x2, y1, y2)
        x1, y1 = (250, 150)
        x2, y2 = (250, 350)
        DDA2(x1, x2, y1, y2) # For dashed line
    else:
        x1, y1 = (150, 150)
        x2, y2 = (150, 350)
        DDA1(x1, x2, y1, y2)
        x1, y1 = (350, 150)
        x2, y2 = (350, 350)
        DDA1(x1, x2, y1, y2)
        x1, y1 = (150, 250)
        x2, y2 = (350, 250)
        DDA2(x1, x2, y1, y2) # For dashed line

def DDA1(x1, x2, y1, y2):
    if(x1 == x2):
        glBegin(GL_POINTS)

        while y1 < y2:

            glVertex2f(x1, y1)
            y1 += 1

        glEnd()
    else:
        m = (y1-y2)/(x1-x2)
        if(m>-1 and m<1):
            glBegin(GL_POINTS)
            while x1 <= x2:
                glVertex2f(x1, round(y1))
                x1 += 1
                y1 += m
            glEnd()
        else:
            glBegin(GL_POINTS)
            while y1 <= y2:
                glVertex2f(round(x1), y1)
                y1 += 1
                x1 += 1/m
            glEnd()

def DDA2(x1, x2, y1, y2):
    if(x1 == x2):
        glBegin(GL_POINTS)

        while y1 < y2:

            glVertex2f(x1, y1)
            y1 += 2

        glEnd()
    else:
        m = (y1-y2)/(x1-x2)
        if(m>-1 and m<1):
            glBegin(GL_POINTS)
            while x1 <= x2:
                glVertex2f(x1, round(y1))
                x1 += 2
                y1 += 2*m
            glEnd()
        else:
            glBegin(GL_POINTS)
            while y1 <= y2:
                glVertex2f(round(x1), y1)
                y1 += 2
                x1 += (1/m*2)
            glEnd()


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode (GL_MODELVIEW)
    glLoadIdentity()

def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0, 3.0)
    #call the draw methods here
    coin_toss()

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()

