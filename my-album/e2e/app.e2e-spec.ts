import { MyAlbumPage } from './app.po';

describe('my-album App', () => {
  let page: MyAlbumPage;

  beforeEach(() => {
    page = new MyAlbumPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
