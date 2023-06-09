from random import randint

from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
xlist = {}
ylist = {}
for i in range(50):
    xlist[i] = randint(0,500)
    ylist[i] = randint(0,500)
def drawPixels():
    glPointSize(5)
    glBegin(GL_POINTS)
    for i in range(50):
        glVertex2f(xlist[i], ylist[i])
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
    drawPixels()

    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()

