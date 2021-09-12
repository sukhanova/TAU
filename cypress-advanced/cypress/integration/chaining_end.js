/// <reference types="cypress" />

beforeEach(() => {

  cy
    .visit('board/3529130557')
})

it('Chaining commands', () => {

  cy
    .contains('cake')

  cy
    .get('[data-cy=list]')
    .eq(0)
    .contains('cake')

});