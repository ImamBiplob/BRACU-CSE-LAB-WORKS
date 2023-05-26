from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

def buildHouse():
#Rectangle
    glPointSize(5)
    glBegin(GL_LINES)
    glVertex2f(50,50)
    glVertex2f(450,50)
    glVertex2f(450, 50)
    glVertex2f(450,300)
    glVertex2f(450,300)
    glVertex2f(50,300)
    glVertex2f(50,300)
    glVertex2f(50,50)
#Triangle
    glVertex2f(50,300)
    glVertex2f(250,450)
    glVertex2f(250,450)
    glVertex2f(450,300)
    glVertex2f(450,300)
    glVertex2f(50,300)
#Door
    glVertex2f(200,50)
    glVertex2f(200,150)
    glVertex2f(200,150)
    glVertex2f(300,150)
    glVertex2f(300,150)
    glVertex2f(300,50)
#window-1
    glVertex2f(100,200)
    glVertex2f(175,200)
    glVertex2f(175,200)
    glVertex2f(175,275)
    glVertex2f(175,275)
    glVertex2f(100,275)
    glVertex2f(100,275)
    glVertex2f(100,200)
#window-2
    glVertex2f(325,200)
    glVertex2f(400,200)
    glVertex2f(400,200)
    glVertex2f(400,275)
    glVertex2f(400,275)
    glVertex2f(325,275)
    glVertex2f(325,275)
    glVertex2f(325,200)
    glEnd()

    glBegin(GL_POINTS)
    glVertex2f(280,100)
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

    buildHouse()

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()
