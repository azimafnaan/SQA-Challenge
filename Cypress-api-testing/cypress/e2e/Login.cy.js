describe('Login Portal API Automation', () => {
  it('Login Authentication', () => {
    cy.request({
      method: 'POST',
      url: 'http://localhost:9999/user',
      body: {
        username: 'SomeName',
        password: 'TopSecret1234!'
      },
      headers: {
        'Content-Type': 'application/json'
      }
    }).then((response) => {
      expect(response.status).to.eq(200);
    });
  })
})