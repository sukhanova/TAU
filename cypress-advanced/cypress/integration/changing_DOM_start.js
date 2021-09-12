/// <reference types="cypress" />

beforeEach(() => {

  cy
    .visit('/board/3529130557');

});

it('Changing the DOM', () => {

  //star the task list
  //cy.visit('/');
  //cy.get('[data-cy="star"]').invoke('show').click()
  

  cy
    .get('[data-cy="task"]')
    .eq(1)
    .invoke('addClass', 'overDue')
    

})