/// <reference types="cypress" />

beforeEach( ()=>{
  cy
  .request({
    method: 'POST',
    url: '/api/reset'
  })
})

it.skip('Sending requests', () => {

  cy
    .visit('/')

    let createResponse
    cy
    .request('POST', '/api/boards', {name: 'board created by .request() command'})
    .then(({body}) =>{
      createResponse = body
    })
  cy
    .request({
      method: 'PATCH',
      url: '/api/boards/22274306652',
      body:{
        name: 'test board'
      }
    })
  cy
  .request({
    method: 'DELETE',
    url: '/api/boards/22274306652'
  })

});