/// <reference types="cypress" />

beforeEach(() => {

  cy
    .visit('board/3529130557')
})

it('Chaining commands', () => {

  cy
    .contains('bread')

  cy
    .get('[data-cy=list]')
    .eq(1)
    .contains('bread')

});